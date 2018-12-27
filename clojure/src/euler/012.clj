; Highly Divisible Triangular Number
; What is the value of the first triangle number to have over five hundered divisors?

(ns euler.012)

(defn is-divisor? [main n]
  (= 0 (rem main n)))

(defn find-divisor [n]
  (flatten (distinct (for [x (range 1 (Math/sqrt n))
                           :when (is-divisor? n x)]
                       [x (/ n x)]))))

(defn get-triangular [f]
  (loop [n 0 curr 1]
    (if (> (count (find-divisor n)) 500)
      n
      (recur (+ n curr) (inc curr)))))

(defn -main [& args]
  (time (prn (get-triangular 500))))
