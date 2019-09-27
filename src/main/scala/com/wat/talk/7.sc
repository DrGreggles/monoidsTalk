/**
 Monoid
 **/

trait Monoid[T] {
 val empty: T
 def combine(a: T, b: T): T
}

// Write generic code!!
def foldMap[A, T](list: List[A])(f: A => T)(implicit monoid: Monoid[T]) = {
  list.foldLeft(monoid.empty)((acc, next) => monoid.combine(acc, f(next)))
}

implicit val intInstance: Monoid[Int] = new Monoid[Int] {
 override val empty = 0
 override def combine(a: Int, b: Int) = a + b
}

foldMap(List(1,2,3,4))(_ * -1)

implicit val stringInstance: Monoid[String] = new Monoid[String] {
 override val empty = ""
 override def combine(a: String, b: String) = a + b
}

foldMap(List('a', 'b', 'c', 'd'))(_.toString)