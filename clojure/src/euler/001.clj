; Multiples of 3 and 5
; Find the sum of all the multiples of 3 or 5 below 1000
(ns euler.001)

(defn divisible [n]
  (or (zero? (rem n 3))
      (zero? (rem n 5))))

(defn -main [& args]
  (prn
   (reduce + (filter divisible (range 1 1000)))))
