; Largest palindrome product
; A palindrome number reads the same both ways IE 9009
; Find the largest palindrom number made from the product of two 3 digit numbers

(ns euler.004
  (:require [clojure.string :as str]))

(defn -main [& args]
  (prn
   (apply max (for [i (range 100 1000)
                    j (range 100 1000)
                    :let [n (* i j)]
                    :when (= (str n)
                             (str/reverse (str n)))]
                n))))
