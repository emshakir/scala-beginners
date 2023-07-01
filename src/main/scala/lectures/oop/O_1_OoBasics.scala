package lectures.oop

object O_1_OoBasics extends App {

  val person = new Person("Shakir", 26)
  person.name = "shaquib"
  person.print
}

class Person(var name: String, var age: Int) {

  def print = println(s"Hi My name is $name and I am $age years Old!")
}

/*

    Var will generate setters and getters
    val will generate getters

    if we don't provide variable types they will act as constructor parameters
    and if we do they act as fields and can be accessed through out the program


 */