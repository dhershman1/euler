; Amicable Numbers
; Evaluate the sum of all the amicable numbers under 10000
(ns euler.021)

(defn proper-divisors-sum [n]
  (let [base (filter #(zero? (mod n %)) (range 2 (Math/sqrt n)))]
    (reduce + 1 (concat (map #(/ n %) base) base))))

(defn amicable? [a b]
  (and (not (= a b))
       (= a (proper-divisors-sum b))
       (= b (proper-divisors-sum a))))

(defn -main []
  (time (prn
         (reduce + (let [sums (vec (map proper-divisors-sum (range 1 10000)))]
                     (for [i (range 1 10000)]
                       (if (amicable? i (nth sums (dec i))) i 0)))))))
