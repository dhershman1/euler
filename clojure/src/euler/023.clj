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

(defn sum-of-proper-divisors [n]
  (let [divs (filter #(zero? (mod n %)) (range 2 (Math/sqrt n)))]
    (reduce + 1 (set (concat
                      (let [isq (int (Math/sqrt n))]
                        (if (= n (* isq isq)) [isq] []))
                      divs
                      (map #(/ n %) divs))))))

(defn abundant? [n]
  (> (sum-of-proper-divisors n) n))

(defn abundant-sum? [n abundant]
  (some #(abundant (- n %))
        (take-while #(< % n) abundant)))

;; Elapsed time: 4189.666082 msecs
(defn -main []
  (time (prn (let [abundant (into (sorted-set) (filter abundant? (range 12 28124)))]
               (->> (range 1 28124)
                    (remove #(abundant-sum? % abundant))
                    (reduce +))))))
