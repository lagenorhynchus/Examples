object FizzBuzzFP {
  def main(args: Array[String]): Unit = {
    (1 to 30).map(fizzBuzz).foreach(println)
  }

  def fizzBuzz(n: Int): String = {
    val isDivisibleBy3 = n % 3 == 0
    val isDivisibleBy5 = n % 5 == 0
    if (isDivisibleBy3 && isDivisibleBy5) {
      "Fizz Buzz"
    } else if (isDivisibleBy3) {
      "Fizz"
    } else if (isDivisibleBy5) {
      "Buzz"
    } else {
      n.toString
    }
  }
}
