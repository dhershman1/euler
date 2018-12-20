; Sum Square Difference
; Find the difference between the sum of the squares of the first one hundred natural numbers
; And then the square of the sum

; This solution is a tad bit overkill for what needs to happen
; I wanted to do some fun little experimentation
(ns euler.006)

(defn square [x]
  (* x x))

(defn sum-of-sqrs [end]
  (->>
   (range 1 end)
   (map square)
   (reduce +)))

(defn sqr-of-sum [end]
  (->>
   (range 1 end)
   (reduce +)
   (square)))

(defn -main [& args]
  (prn (- (sqr-of-sum 101) (sum-of-sqrs 101))))
