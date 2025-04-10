package trycatch

import scala.util.Try

object Main2 {
  def main(args: Array[String]): Unit = {
    println(divide(10, 0))
  }

  def divide(a: Int, b: Int): Try[Int] = {
    Try {
      a / b
    }
  }
}
