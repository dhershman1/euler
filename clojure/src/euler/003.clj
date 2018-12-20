; Largest prime factor
; The prime factors of 13195 are 5, 7, 13, and 29
; What is the largest prime factor of the number 600851475143

(ns euler.003)

(defn prime-factors [n divisor factors]
  (if (< n 2)
    factors
    (if (zero? (rem n divisor))
      #(prime-factors (/ n divisor) divisor (conj factors divisor))
      #(prime-factors n (inc divisor) factors))))

(defn -main [& args]
  (prn (apply max (trampoline prime-factors 600851475143 2 []))))
