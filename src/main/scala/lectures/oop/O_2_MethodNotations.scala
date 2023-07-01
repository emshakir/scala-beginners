package lectures.oop

object O_2_MethodNotations extends App {

  class Person(val name: String, val favouriteMovie: String) {

    def likes(movie: String) = favouriteMovie == movie

    def +(person: Person) = s"${this.name} is hanging out with ${person.name}"

    def +(nickname: String): Person =
      new Person(s"$name $nickname", favouriteMovie)

    def unary_! : String =
      "This is Unary Operation, can be called only with !, Make sure to give space after " +
        "name or else it will consider : as symbol"

    def isAlive = true

    def apply() = "This is apply methods will call scala inbuilt apply method."
  }

  var mary = new Person("Mary", "Inception")

  // Infix Notation
  mary.likes("Inception")
  mary likes "Inception" //Infix Notation Equivalent or also called syntactic sugar, which looks like natural.
  mary + mary

  // Prefix notation
  println(mary.unary_!)
  println(!mary) // Both the methods are equivalent, only allowed for +, -, !, ~

  // Postfix Notation
  println(mary.isAlive)
  println(mary isAlive) // Both are equivalent, e can ignore '.' just like infix, but this is not recommended not much readable

  // apply
  println(mary.apply())
  println(mary()) // Both are equivalent, only for methods with no parameter.

}
