; Summation of primes
; Find the sum of all primes under two million

(ns euler.010
  (:require [euler.007 :as algo]))

(defn -main [& args]
  (prn (reduce + (algo/sieve (- 2E6 1)))))
