(ns compile
  (:require [clojure.java.io :as io]
            [cljs.closure :as cljsc]))

(defn dev 
  []
  (cljsc/build
    (io/resource "piggieback_browser.cljs") 
    {:output-to "target/war/js/piggieback_browser.js"
     :output-dir "target/war/js"}))
