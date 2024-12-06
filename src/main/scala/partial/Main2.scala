package partial

object Main2 {
  def main(args: Array[String]): Unit = {
    val partialFunc1: PartialFunction[Int, String] = {
      case 1 => "One"
      case 2 => "Two"
    }

    val partialFunc2: PartialFunction[Int, String] = {
      case 3 => "Three"
      case 4 => "Four"
    }

    val combinedFunc = partialFunc1.orElse(partialFunc2)

    println(combinedFunc(1)) // "One"
    println(combinedFunc(3)) // "Three"
    println(combinedFunc(5)) // MatchError 발생
  }
}
