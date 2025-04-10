package map

import map.model.SecondOrder

object Main {
  def main(args: Array[String]): Unit = {
    val maps: Seq[Map[Obj, String]] = Seq(
      Map(Obj(1, "1", "1-VALUE") -> "BidRequest1", Obj(2, "ABC", "ABC-VALUE") -> "BidRequest2", Obj(1, "2", "2-VALUE-VALUE") -> "BidRequest6"),
      Map(Obj(2, "2", "2-VALUE") -> "BidRequest3", Obj(1, "2", "2-VALUE-VALUE") -> "BidRequest4"),
      Map(Obj(3, "CBA", "3-VALUE") -> "BidRequest5")
    )

    val flat = (for {
      map <- maps
      (obj, value) <- map
    } yield {
      (obj.order, obj, value)
    }).groupBy(_._1)
      .map(_._2
        .groupBy(_._2)
        .mapValues(value => value))

    print(flat)
  }
}

package object model {
  type SecondOrder = String
}

case class Obj(order: Int, secondOrder: SecondOrder, value: String)