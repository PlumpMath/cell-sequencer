(ns cell-sequencer.max-io-test
  (:require (cell-sequencer [max-io :as io]))
  (:use [expectations]))

(expect '[1 2 3 4]
        (io/parse-event "1 2 3 4"))

(expect '(foo bar)
        (io/parse-event "foo bar"))
