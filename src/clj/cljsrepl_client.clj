(ns cljsrepl-client
  (:require cljs.repl.browser)
  (:require cemerick.piggieback))



(defn start []
  (cemerick.piggieback/cljs-repl
   :repl-env (cljs.repl.browser/repl-env 
              :port 9000
              :static-dir ["resources/public"
                           "target/war"])))
