package trycatch

import scala.util.Try

object Main2 {
  def main(args: Array[String]): Unit = {
    println()
  }

  def divide(a: Int, b: Int): Try[Int] = {
    Try {
      a / b
    }
  }

  def divide2(a: Int, b: Int): Int = {
    a / b
  }
}
