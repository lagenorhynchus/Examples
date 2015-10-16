(ns run-length-encoding)

(defn rle [s]
  (->> s
       (partition-by identity)
       (map #(str (first %) (count %)))
       (apply str)))
