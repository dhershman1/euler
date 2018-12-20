; Special Pythagorean Triplet
; There exists exactly one Pythagorean triplet for a + b + c = 1000
; Find a, b, and c

(ns euler.009)

(defn sq [x]
  (* x x))

(defn generate-triple [x]
  (for [n (range 1 100)
        m (range n 100)
        k (range 1 100)
        :let [a (- (sq m) (sq n))
              b (* 2 m n)
              c (+ (sq m) (sq n))]
        :when (= (+ (* k a) (* k b) (* k c)) x)]
    (* a b c)))

(defn -main [& args]
  (prn
   (last (generate-triple 1000))))
