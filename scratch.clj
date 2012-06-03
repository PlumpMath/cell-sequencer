(ns user
  (:require (cell-sequencer [core :as c])))

(nil? (re-find #"^X." "XaXbXc"))

(not (nil? (re-find #"^-?\d" "-23")))
