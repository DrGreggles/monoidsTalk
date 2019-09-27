/**
 Type classes 101
 **/

// Multiple instances

trait ImplicitThing[T] {
 val value: T
}

implicit val intInstance: ImplicitThing[Int] = new ImplicitThing[Int] {
 override val value = 5
}

def useImplicit[T](implicit x: ImplicitThing[T]) = x.value

useImplicit[Int]


implicit val stringInstance: ImplicitThing[String] = new ImplicitThing[String] {
 override val value = "five"
}

useImplicit[String]