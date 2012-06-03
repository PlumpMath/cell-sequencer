(ns cell-sequencer.max-io)

(defn read-as-vector
  ^{:private true
    :doc "Read a text chunk as a list (vector)."}
  [text]
  (read-string (str "[" text "]")))

(defn read-as-sexp
  ^{:private true
    :doc "Read a text chunk as some actual lisp, adding parens."}
  [text]
  (read-string (str "(" text ")")))

(defn starts-numeric
  ^{:private true
    :doc "Does this string appear to start numerically?"}
  [text]
  (not (nil? (re-find #"^-?\d" text))))

(defn parse-event
  ^{:doc "Parse an event string coming in from Max."}
  [text]
  (cond (starts-numeric text) (read-as-vector text)
        :else (read-as-sexp text)))

(defn parse-destination
  ^{:doc "Parse the destination to jump to once we've fired."}
  [text])

(defn parse-interval
  ^{:doc "Parse the interval until the next action."}
  [text])
