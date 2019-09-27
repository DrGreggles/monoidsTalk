/**
 I hate Future.sequence(...)
 **/

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

Future.sequence(List(1,2,3,4,5).map(Future.successful)) // 😭

Future.traverse(List(1,2,3,4,5))(Future.successful) // 😢

import cats.implicits._

List(1,2,3,4,5).map(Future.successful).sequence // 🙂
List(1,2,3,4,5).traverse(Future.successful) // 😎


List(1,2,3,4,5).traverse(Option(_)) // 😸

def errorIfMoreThan5(n: Int) =
  if (n > 5) Left(s"👎$n > 5") else Right(n)

List(1,2,3,4,5).traverse(errorIfMoreThan5) // 😻
List(1,2,3,4,5,6).traverse(errorIfMoreThan5) // 🙀



Either.traverse(List(1,2,3,4))(errorIfMoreThan5) // 🖕