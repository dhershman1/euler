; Non-abundant Sums
; https://projecteuler.net/problem=23
; Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers

; A perfect number is a number which the proper divisors are exactly equal to the number
; Example: The perfect divisors of 28 are 1, 2, 4, 7, and 14
; The sum of these diviors is: 1 + 2 + 4 + 7 + 14 = 28
; Which means that 28 is a "perfect" number.
(ns euler.023)

; A number is called "deficient" if the sume of its proper divisors is less than the number
; It is called "abundant" if this sum exceeds the number

(defn get-proper-divisors [n]
  (filter #(zero? (mod n %)) (range 2 (Math/sqrt n))))

(defn proper-divisors-sum [n]
  (prn (filter not-empty (get-proper-divisors n)))
  (reduce + 1 (get-proper-divisors n)))

(defn abundant? [n]
  (> (proper-divisors-sum n) n))

(defn -main []
  (time (prn (filter abundant? (range 12 40)))))
