(ns flycouchdbexample.core
  (:use [clojure.java.io :only (file resource)]
        [flycouchdb.migration :only (migrate flycouchdb)])
  (:gen-class))


(def folder-path (resource "migrations/"))

(def flydb (flycouchdb folder-path))

(defn -main
  "The application's main function"
  [& args]
  (do
    (println "Running migrations")
    (migrate flydb)
    (println "Done!")))

