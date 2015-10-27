object RunLengthEncoding {
  def rle(s: String): String =
    s.reverse.foldLeft(List[(Char, Int)]()) { (ts, c) =>
      ts match {
        case x :: xs if x._1 == c => (c, x._2 + 1) :: xs
        case _ => (c, 1) :: ts
      }
    }.foldLeft(new StringBuilder) { (sb, t) =>
      sb.append(t._1).append(t._2)
    }.mkString("")
}
