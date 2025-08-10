(ns when-tls.core
  (:gen-class))

(defn create-socket [hostname]
  (.createSocket (javax.net.ssl.SSLSocketFactory/getDefault) hostname 443))

(defn open-socket-and-get-certificates [hostname]
  (with-open [s (create-socket hostname)]
    (.startHandshake s)
    (.getPeerCertificates (.getSession s))))

(defn -main
  "I don't do a whole lot ... yet."
  [hostname & args]
  (doseq [c (open-socket-and-get-certificates hostname)]
    (println (str (.getNotAfter c) " " (.toString (.getSubjectDN c))))))

