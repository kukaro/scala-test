import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

object FutureExample extends App{

  // 비동기 작업을 수행하는 Future
  val futureResult: Future[Int] = Future {
    // 시간이 걸리는 작업 (예: 1초 동안 기다렸다가 숫자 반환)
    Thread.sleep(1000)
    42 // 결과 값
  }

  // Future의 완료 결과를 처리
  futureResult.onComplete {
    case Success(value) =>
      println(s"결과: $value")
    case Failure(exception) =>
      println(s"실패: ${exception.getMessage}")
  }

  // 프로그램이 바로 종료되지 않도록 기다리기 (실제 애플리케이션에서는 필요하지 않을 수 있음)
  Thread.sleep(2000)
}
