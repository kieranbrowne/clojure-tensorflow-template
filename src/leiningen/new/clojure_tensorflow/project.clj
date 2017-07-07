(defproject {{name}} "0.1.0-SNAPSHOT"
  :description  "FIXME"
  :dependencies [[org.clojure/clojure  "1.8.0"]
                 [clojure-tensorflow  "0.2.4"]]
  {{#gorilla-repl?}}
  :main ^:skip-aot {{name}}.core
  :target-path  "target/%s"
  :plugins  [[lein-gorilla  "0.4.0"]]
  :profiles  {:uberjar  {:aot :all}}
  {{/gorilla-repl?}})
