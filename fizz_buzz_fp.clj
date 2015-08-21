(ns fizz-buzz-fp)

(defn fizz-buzz [n]
  (let [divisible-by-3? (zero? (mod n 3))
        divisible-by-5? (zero? (mod n 5))]
    (cond
      (< n 1)               (throw (IllegalArgumentException. "n cannot be less than 1"))
      (and divisible-by-3?
           divisible-by-5?) "Fizz Buzz"
      divisible-by-3?       "Fizz"
      divisible-by-5?       "Buzz"
      :else                 (str n))))

;; pattern 1
(doall (map (comp println fizz-buzz) (range 1 (inc 30))))

;; pattern 2
(->> (range 1 (inc 30))
     (map (comp println fizz-buzz))
     doall)
