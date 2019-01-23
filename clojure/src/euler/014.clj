; Starting with a number under one million what number produces the longest chain
; With the following rules:
; n is even: n → n/2 and when n is odd: n → 3n + 1
; Example: 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1

; This still runs pretty slow, could use with some tweaking and enhancements
; Similar to Problem #12 which also needs tweaked
(ns euler.014)

(defn next-term [n]
  (if (even? n)
    (/ n 2)
    (inc (* 3 n))))

(defn chain-length [n]
  (if (= n 1) 1
      (inc (chain-length (next-term n)))))

(defn -main [& args]
  (time (prn (first
              (apply max-key second
                     (map #(list % (chain-length %)) (range 1 1000000)))))))
