package option

object Main {
  def main(args: Array[String]): Unit = {
    val opt: Option[Boolean] = Some(true)
    println(opt.filter(_ == false))
  }
}
