object SortingTest {
  case class User(val id: Int, val name: String)

  def main(args: Array[String]): Unit = {
    val users = List(
      new User(3, "A"),
      new User(1, "B"),
      new User(2, "C")
    )
    println(s"users: ${users}")

    val sortedUsers1 = users.sortWith((x, y) => x.id < y.id)
    println(s"sortedUsers1: ${sortedUsers1}")

    val sortedUsers2 = users.sortWith(_.id < _.id)
    println(s"sortedUsers2: ${sortedUsers2}")

    val sortedUsers3 = users.sortBy(x => x.id)
    println(s"sortedUsers3: ${sortedUsers3}")

    val sortedUsers4 = users.sortBy(_.id)
    println(s"sortedUsers4: ${sortedUsers4}")
  }
}
