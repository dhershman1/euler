; Smallest Multiple
; What is the smallest positive number that is evenly divisible by all the number from 1 to 20

(ns euler.005)

(defn -main [& args]
  (loop [n 20]
    (if (every? (fn [x] (zero? (rem n x))) (range 1 20))
      (prn n)
      (recur (+ n 20)))))
