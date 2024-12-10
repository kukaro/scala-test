package partial

object MultiplePattern {
  def main(args: Array[String]): Unit = {
    val num = 3

    val result = num match {
      case 1 | 3 | 5 => "Odd number"
      case 2 | 4 | 6 => "Even number"
      case _ => "Other number"
    }

    println(result) // "Odd number"
  }
}
