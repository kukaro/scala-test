object Main {
  var a = 10

  def main(args: Array[String]): Unit = {
    println("HI")
    val bmw = new BMW
    println(bmw)
    println(c())
    print(b)
  }

  def b = "hello"
  def c() = "hi"
}
