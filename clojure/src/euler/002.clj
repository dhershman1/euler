; Even Fibonacci Numbers
; By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.

(ns euler.002)

(defn genFib []
  (map first (iterate (fn [[a b]] [b (+ a b)]) [1 2])))

(defn -main [& args]
  (prn
   (reduce + (filter even? (take-while
                            (partial > 4000000)
                            (genFib))))))
