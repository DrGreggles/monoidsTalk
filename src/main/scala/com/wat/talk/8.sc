/**
 Cats Monoid
 **/

import cats.implicits._

List(1,2,3,4).foldMap(_ * -1)
List('a', 'b', 'c', 'd').foldMap(_.toString)


// !!!!!!!!!!!!!
List( "cats", "is", "super", "super", "powerful").foldMap{
 word =>
  (1, word.length, Map(word -> 1))
}