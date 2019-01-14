; Factorial digit sum
; n! means n x (n - 1) So: 5! is 5 * 4 * 3 * 2 * 1 = 120 and 1 + 2 + 0 = 3
; Find the sum of the digits for the number 100!

(ns euler.020)

(defn ! [n]
  (reduce *' (range 1 (inc n))))

(defn get-sum [n]
  (reduce + (map #(- (int %) 48) (seq (str n)))))

(defn -main []
  (time (prn (get-sum (! 100)))))
