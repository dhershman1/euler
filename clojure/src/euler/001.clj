; Multiples of 3 and 5
; Find the sum of all the multiples of 3 or 5 below 1000
(ns euler.001)

(defn -main [& args]
  (prn
   (reduce + (filter fn [x]
                     (or (zero? (rem x 3))
                         (zero? (rem x 5))))
           (range 1 1000))))
