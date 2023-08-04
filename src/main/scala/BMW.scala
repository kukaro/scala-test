class BMW extends Car with Shiny {
  override val brand: String = "BMW"
  override val shineRefraction: Int = 12

  override def toString: String = {
    return "brand: " + brand + ", shineRefraction: " + shineRefraction
  }
}
