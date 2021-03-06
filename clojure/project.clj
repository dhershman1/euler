(defproject euler "0.1.0-SNAPSHOT"
  :description "A Project Euler Experiment"
  :url "https://github.com/dhershman1/euler"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/math.numeric-tower "0.0.4"]]
  :resource-paths ["resources"]
  :main ^:skip-aot euler.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
