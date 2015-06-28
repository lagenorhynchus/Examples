(defrecord User [id name])

(def users
  [(->User 3 "A")
   (->User 1 "B")
   (->User 2 "C")])
(println "users:" users)

(def sorted-users1
  (sort-by :id users))
(println "sorted-users1:" sorted-users1)
