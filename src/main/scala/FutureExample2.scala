import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.{Failure, Success}

object FutureExample2 extends App{

  val futureResult: Future[Int] = Future {
    42 // 결과 값
  }



  Thread.sleep(2000)
}
