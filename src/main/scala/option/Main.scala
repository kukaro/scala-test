package option

object Main {
  def main(args: Array[String]): Unit = {
    val opt: Option[Int] = Some(2)
    println(opt.flatMap(x => Some(x * 2)))
    println(opt.map(x => x * 2))
  }
}
