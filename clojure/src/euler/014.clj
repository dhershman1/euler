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
    (+ (* 3 n) 1)))

(defn chain-length
  ([n]
   (if (= n 1)
     1
     (chain-length (next-term n) 2)))
  ([n len]
   (if (= n 1)
     len
     (chain-length (next-term n) (+ len 1)))))

(defn find-longest-chain [n]
  (let [len (map chain-length (range 2 n 1))]
    (+ (.indexOf len (apply max len)) 2)))

(defn -main [& args]
  (time (prn (find-longest-chain 1000000))))
