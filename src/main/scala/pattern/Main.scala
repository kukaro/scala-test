package pattern

import scala.concurrent.Future

object Main {
  def main(args: Array[String]): Unit = {
    example("hello")
    example("world")
    example("default")
    example2("hello")
    example2("world")
    example2("default")
    Future
  }

  private def example(str: String): Unit = {
    str match {
      case _ if str.contains("hello") => println("hello")
      case _ if str.contains("world") => println("world")
      case _ => println("default")
    }
  }

  private def example2(str: String): Unit = {
    str match {
      case "hello" => println("hello")
      case "world" => println("world")
      case _ => println("default")
    }
  }
}
