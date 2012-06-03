(ns user
  (:require (cell-sequencer [core :as c]
                            [max-io :as io])))

(nil? (re-find #"^X." "XaXbXc"))

(not (nil? (re-find #"^-?\d" "-23")))

(eval (io/parse-event "inc 5"))

(fn? (eval (io/parse-event "fn [x] x")))

(fn? (fn [x] x))

(eval (io/parse-event "56"))

(class (io/parse-event "3 4"))

(class (io/parse-event "inc"))

(defn doit [x y text]
  (let [v (eval (io/parse-event text))]
    (if (fn? v)
      (v x y)
      v)))

(doit 2 3 "identity")
