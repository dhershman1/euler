; 10001st prime
; What is the 10001st prime number?
; Using the Sieve of Eratosthenes Algorithm

(ns euler.007)

(defn clean-sieve [step i primes]
  (if (<= i (count primes))
    (recur step (+ i step) (assoc! primes i nil))
    primes))

(defn sieve-step [i primes]
  (if (< i (count primes))
    (recur (+ 2 i)
           (if (nil? (primes i)) primes (clean-sieve (* 2 i) (* i i) primes)))
    primes))

(defn sieve [x]
  (->>
   (range x)
   (vec)
   (transient)
   (clean-sieve 2 4)
   (sieve-step 3)
   (persistent!)
   (filter (complement nil?))
   (drop 2)))

(defn -main [& args]
  (prn (nth (sieve 1E6) 10000)))
