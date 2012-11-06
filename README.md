# cljslein

Attempt to create a ClojureScript project with Leinigen2, nrepl, piggieback.

Not trying to bring in cljsbuild yet.

## Folders structure

src/clj : clojure source files root folder.
src/clj/compile.clj : namespace with 'dev function to compile src/cljs/piggieback_browser.cljs to target/war/js/piggieback_browser.js
src/clj/cljsrepl_client.clj : namespace with function 'start to start the cljs repl client listening on port 9000, and serving static content for folders resources/public/ and target/war/ 

src/cljs : clojurescript source files root folder.
src/cljs/piggieback_browser.cljs : clojurescript namespace bootstrapping a connection to port 9000 to serve as the javascript evaluation environment

resources/public : static resources to be served by the http server. Resources right under resources/public will be mapped to their name at the root of the server URL
resources/public/hello-dev.html : dev entry point of our single-page application. Will be reached through http://localhost:9000/hello-dev.html during development once the repl client will be manually started

## Launch the development environment

pre-requisite: lein2 preview9 of higher installed and setup in $PATH

Start an nrepl server and command line client:

 cd /path/to/cljslein
 lein repl

The first time, and everytime the target/ folder is cleaned up, recompile src/cljs/piggieback_browser.cljs to target/war/js/piggieback_browser.js:

 (require 'compile)
 (compile/dev)

Start the RPL part of the clojurescript REPL from the Clojure REPL:

 (require '[cljsrepl-client :as rpl])
 (rpl/start)

Open a browser to the page http://localhost:9000/hello-dev.html

Back in the repl, try to evaluate something:

 (+ 1 2)


## License

Copyright © 2012 FIXME

Distributed under the Eclipse Public License, the same as Clojure.
