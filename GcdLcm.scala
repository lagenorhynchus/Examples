object GcdLcm {
  def gcd(a: Int, b: Int): Option[Int] = {
    @annotation.tailrec
    def divide(x: Int, y: Int): Int =
      if (y == 0) x
      else divide(y, x % y)

    if (a < 1 || b < 1) None
    else Some(divide(a, b))
  }

  def lcm(a: Int, b: Int): Option[Int] =
    gcd(a, b).map(a * b / _)

  def lcm2(a: Int, b: Int): Option[Int] =
    for {
      g <- gcd(a, b)
    } yield a * b / g
}
