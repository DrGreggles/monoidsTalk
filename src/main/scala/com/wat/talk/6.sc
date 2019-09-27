/**
 Monoid
 **/

trait Monoid[T] {
 val empty: T
 def combine(a: T, b: T): T
}

implicit class Ops[T](t: T)(implicit monoid: Monoid[T]) {
 def |+|(other: T) = monoid.combine(t, other)
}

implicit val intInstance: Monoid[Int] = new Monoid[Int] {
 override val empty = 0
 override def combine(a: Int, b: Int) = a + b
}

420 |+| 69

implicit val stringInstance: Monoid[String] = new Monoid[String] {
 override val empty = ""
 override def combine(a: String, b: String) = a + b
}

"<3 " |+| "category theory"