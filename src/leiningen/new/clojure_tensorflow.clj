(ns leiningen.new.clojure-tensorflow
  (:require [leiningen.new.templates 
             :refer [renderer sanitize-ns name-to-path ->files]]
            [leiningen.core.main :as main]
            ))


(def render (renderer "clojure-tensorflow"))

(defn clojure-tensorflow
  "FIXME: write documentation"
  [name & options]
  (let [data {:name name
              :title 
			  (-> name
                (clojure.string/replace #"-" " ")
				(clojure.string/split #"\b") 
				(->> (map clojure.string/capitalize))
				clojure.string/join)
              :ns-name (sanitize-ns name)
              :sanitized (name-to-path name)
              :gorilla-repl? (some #{"+gorilla-repl"} options)
              }]
    (main/info "Generating fresh 'lein new' clojure-tensorflow project.")
    (->files data
             ["README.md" (render "README.md" data)]
             ["project.clj" (render "project.clj" data)]
             [".gitignore" (render ".gitignore" data)]
             ["src/{{sanitized}}/core.clj" 
              (render (if (:gorilla-repl? data) "src/core.gorilla.clj" "src/core.clj")  data)]
             )))
