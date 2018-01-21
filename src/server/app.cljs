(ns server.app
  (:require
   [server.core :as core]
   [cljs.nodejs :as node]
   [mount.core :as mount]))

(mount/in-cljc-mode)

(cljs.nodejs/enable-util-print!)

(.on js/process "uncaughtException" #(js/console.error %))

(def init core/server)
