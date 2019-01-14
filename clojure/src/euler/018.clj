; By starting at the top of the triangle below and moving to adjacent numbers on the row below, the maximum total from top to bottom is 23.
; Find the maximum total from top to bottom of the triangle provided

(ns euler.018)

(def triangle
  (map #(Integer/parseInt %)(map #(reduce str %) (partition 2 2 (remove #(or (= \newline %) (= \space %))
    (seq (slurp "resources/018-triangle.txt")))))))

(def nested-triangle
  (loop [lst triangle n 1 newlist nil]
    (if (empty? lst) (reverse newlist)
      (recur (drop n lst) (inc n) (cons (take n lst) newlist)))))

(defn max-row [lst]
  (map #(reduce max %) (partition 2 1 lst)))

(defn step-max [lst1 lst2]
(map + (max-row lst1) lst2))

(defn -main [& args]
  (time (prn (reduce step-max (reverse nested-triangle)))))
