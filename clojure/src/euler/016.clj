; Power of digit sum
; What is the sum of the digits of the number 2^1000

(ns euler.016)

(defn pow [n power]
  (loop [total 1 curr-pow power]
    (if (= curr-pow 0)
      total
      (recur (bigint (* total n)) (dec curr-pow)))))

(defn sum-digits [n]
  (apply + (map (fn [x] (Character/getNumericValue x)) (str n))))

(defn -main [& args]
<<<<<<< HEAD
  (time (prn (sum-digits (pow 2 1000)))))
=======
  (time (prn (sum-digits (pow 2 1000)))))
>>>>>>> f7d785ebca0763c5b7e2c3ba506933acc2789478
