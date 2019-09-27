/**
 Type classes 101
 **/

// Regular implicits

trait ImplicitThing {
 val value: Int
}

implicit val instance: ImplicitThing = new ImplicitThing {
 override val value = 5
}

def useImplicit(implicit x: ImplicitThing) = x.value

useImplicit
