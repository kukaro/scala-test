object MapTest {
  def main(args: Array[String]): Unit = {
    val a = Map("a" -> 1, "b" -> 2, "c" -> 3)
    val b: Option[String] = Some(null)
    println(a.get(b.get))
  }
}
