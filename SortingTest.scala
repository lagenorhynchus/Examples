object SortingTest {
  case class User(val id: Int, val name: String)

  def main(args: Array[String]): Unit = {
    val users = List(
      new User(3, "A"),
      new User(1, "B"),
      new User(2, "C")
    )
    println(s"users: ${users}")

    val sortedUsers1 = users.sortBy(x => x.id)
    println(s"sortedUsers1: ${sortedUsers1}")

    val sortedUsers2 = users.sortBy(_.id)
    println(s"sortedUsers2: ${sortedUsers2}")
  }
}
