; Largest prime factor
; The prime factors of 13195 are 5, 7, 13, and 29
; What is the largest prime factor of the number 600851475143

(ns euler.003)

(defn getEvens [n]
  (->>
    (range 3 n)
    (filter even?)
    (into [])))

(defn prime-factors [n]
  (reduce
    (fn [primes num]
      (if (some zero? (map (partial mod num) primes))
        primes
        (conj primes num)))
    [2] n))

(defn -main [& args]
  (print (apply max (prime-factors (getEvens 50)))))
