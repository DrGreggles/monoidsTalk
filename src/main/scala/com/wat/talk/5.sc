/**
 Type classes 101
 **/

// Ops

trait ImplicitThing[T] {
 val value: T
}
implicit class Ops[T](t: T)(implicit implicitThing: ImplicitThing[T]) {
 def value = implicitThing.value
}

implicit val intInstance: ImplicitThing[Int] = new ImplicitThing[Int] {
 override val value = 5
}

// ^^^^ all of this can be imported / hidden

// magic!!!
100.value