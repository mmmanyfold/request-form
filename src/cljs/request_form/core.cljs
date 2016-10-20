(ns request-form.core
    (:require [reagent.core :as reagent]
              [re-frame.core :as re-frame]
              [request-form.events]
              [request-form.subs]
              [request-form.routes :as routes]
              [request-form.views :as views]
              [request-form.config :as config]))


(defn dev-setup []
  (when config/debug?
    (enable-console-print!)
    (println "dev mode")))

(defn mount-root []
  (reagent/render [views/main-panel]
                  (.getElementById js/document "app")))

(defn ^:export init []
  (routes/app-routes)
  (re-frame/dispatch-sync [:initialize-db])
  (dev-setup)
  (mount-root))
