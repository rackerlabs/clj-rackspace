(ns rackspace.servers.v2.service
  (:require [clojure.data.json :as json]))

(defn get-new-server-payload [server-name image-id flavor-id]
  {:body (json/write-str {:server
                          {:name server-name
                           :imageRef image-id
                           :flavorRef flavor-id}})
   :headers {"Content-Type" "application/json"}})
