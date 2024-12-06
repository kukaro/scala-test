package trycatch

object Main {
  def main(args: Array[String]): Unit = {
    println(divide(10, 0))
  }

  def divide(a: Int, b: Int): Int = {
    try {
      a / b
    } catch {
      case e: ArithmeticException =>
        println(s"Error: ${e.getMessage}")
        0 // 기본값 반환
    }
  }
}
