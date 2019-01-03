; lattice-paths
; How many different ways aret there to get to the bottom right corner of a 20 x 20 grid
; You can only move to the right and down

(ns euler.015)

(defn iterative-factorial [n current]
  (if (= n 1)
    current
    (iterative-factorial (- n 1) (* n current))))

(defn permutations [x y]
  (let [grid-x (bigint x) grid-y (bigint y)]
    (/ (iterative-factorial (+ grid-x grid-y) 1)
       (* (iterative-factorial grid-x 1) (iterative-factorial grid-y 1)))))

(defn -main [& args]
  (time (prn (permutations 20 20))))
