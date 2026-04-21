package sliding


object Main {
  def main(args: Array[String]): Unit = {
    B.f()
  }
}

trait A {
  def f(): Unit = {
    println("A.f")
    g()
  }

  def g(): Unit = {
    println("A.g")
  }
}

object B extends A {
  override def f(): Unit = {
    println("B.f")
    super.f()
  }

  override def g(): Unit = {
    println("B.g")
  }
}