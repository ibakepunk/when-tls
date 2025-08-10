(defproject when-tls "0.1.0-SNAPSHOT"
  :description "Show TLS certificate expiration date."
  :url "https://github.com/ibakepunk/when-tls"
  :license {:name "GNU GPLv3"
            :url "https://www.gnu.org/licenses/gpl-3.0.en.html"}
  :dependencies [[org.clojure/clojure "1.11.1"]]
  :main ^:skip-aot when-tls.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
