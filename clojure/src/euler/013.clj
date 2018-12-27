; Large Sum
; Work of the first ten digits of the sum of the one-hundred 50 digit numbers

(ns euler.013)
(use 'clojure.java.io)

(defn parse-bigint [n]
  (bigint (re-find #"\d+" n)))

(defn get-nums []
  (with-open [rdr (reader (str (System/getProperty "user.dir") "/resources/013-numbers.txt"))]
    (into [] (doall (line-seq rdr)))))

(defn get-sum [n]
  (reduce + (map parse-bigint n)))

(defn get-first-ten-digits [n]
  (subs (str n) 0 10))

(defn -main [& args]
  (time (prn (->>
              (get-nums)
              (get-sum)
              (get-first-ten-digits)))))
