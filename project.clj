(defproject cljslein "0.1.0-SNAPSHOT"
  
  :description "FIXME: write description"
  
  :url "http://example.com/FIXME"

  :repositories {"sonatype-oss-public" "https://oss.sonatype.org/content/groups/public/"}  
  
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
    
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [com.cemerick/piggieback "0.1.0"]
                 [org.clojure/clojurescript "0.0-1847"]
                 ]

  :repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}
  
  :source-paths ["src/clj"
                 "src/cljs"])
