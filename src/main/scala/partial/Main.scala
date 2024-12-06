package partial

object Main {
  def main(args: Array[String]): Unit = {
    val partialFunc: PartialFunction[Int, String] = {
      case 1 => "One"
      case 2 => "Two"
      case 3 => "Three"
    }

    println(partialFunc.isDefinedAt(1)) // true
    println(partialFunc.isDefinedAt(4)) // false
    println(partialFunc(1)) // "One"
    println(partialFunc(4)) // MatchError 발생
  }
}
