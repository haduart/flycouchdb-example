(defproject flycouchdb-example "0.1.0-SNAPSHOT"
  :description "Example project for FlyCouchDB"
  :url "https://github.com/haduart/flycouchdb-example"
  :license {:name "BSD"
            :url "http://www.opensource.org/licenses/BSD-3-Clause"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [flycouchdb "0.1.26-SNAPSHOT"]]

  :min-lein-version "2.0.0"

  :profiles {:dev {:dependencies [[ring-mock "0.1.5"] [midje "1.6.3"]
                                  [peridot "0.3.1"]]}
             :1.5 {:dependencies [[org.clojure/clojure "1.5.1"]]}
             :1.6 {:dependencies [[org.clojure/clojure "1.6.0"]]}
             :1.7 {:dependencies [[org.clojure/clojure "1.7.0-alpha5"]]}}

  :aliases {"dev" ["do" "test"]}

  :resource-paths ["resources"]

  :main flycouchdbexample.core
  :aot [flycouchdbexample.core])
