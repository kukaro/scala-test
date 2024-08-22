object Main {
  var a = 10

  def main(args: Array[String]): Unit = {
    val b = Seq[Number](1, 2, 3, 4, 5)
    Some(1).map(_ => a = 20)
    println(Some(None))
    println(Some(null))
    println(Option(null))
    println(b)
  }

}
