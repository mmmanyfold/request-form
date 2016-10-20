(ns request-form.events
    (:require [re-frame.core :as re-frame]
              [request-form.db :as db]))

(defonce contentful-cdn-key "63815db355eb39216d18b94382bbac67d85b512e4fee1640345212b4db45e445")

(defonce space "raogay7t6p1x")

(re-frame/reg-event-db
 :initialize-db
 (fn  [_ _]
   db/default-db))

(re-frame/reg-event-db
 :set-active-panel
 (fn [db [_ active-panel]]
   (assoc db :active-panel active-panel)))
