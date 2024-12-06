package partial

object Main3 {
  def main(args: Array[String]): Unit = {
    val data = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val evenFilter: PartialFunction[Int, String] = {
      case x if x % 2 == 0 => s"$x is even"
    }

    val oddFilter: PartialFunction[Int, String] = {
      case x if x % 2 != 0 => s"$x is odd"
    }

    val processedData = data.collect(evenFilter) ++ data.collect(oddFilter)

    println(processedData)
    // 출력:
    // List("2 is even", "4 is even", "6 is even", "8 is even", "10 is even",
    //      "1 is odd", "3 is odd", "5 is odd", "7 is odd", "9 is odd")
  }
}
