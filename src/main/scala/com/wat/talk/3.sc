/**
 Type classes 101
 **/

// Add a type parameter

trait ImplicitThing[T] {
 val value: T
}

implicit val intInstance: ImplicitThing[Int] = new ImplicitThing[Int] {
 override val value = 5
}

def useImplicit[T](implicit x: ImplicitThing[T]) = x.value

useImplicit[Int]


