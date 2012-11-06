(ns cljsrepl-client
  (:require cljs.repl.browser)
  (:require cemerick.piggieback))



(defn start []
  (cemerick.piggieback/cljs-repl
    :repl-env (doto (cljs.repl.browser/repl-env 
                      :port 9000
                      :static-dir ["resources/public"
                                   "target/war"])
                cljs.repl/-setup)))