; Names Scores
; Sort the txt file, and work out the alphabetical value for each name
; What is the total of all the name scores in the file?
(ns euler.022)

(defn score [name]
  (reduce + (map #(- (int %) 64) name)))

(defn -main []
  (time (prn
         (->> "resources/022-names.txt"
              (slurp)
              (re-seq #"\w+")
              (sort)
              (map-indexed #(* (inc %1) (score %2)))
              (reduce +)))))
