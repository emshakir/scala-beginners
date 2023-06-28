package lectures.basics

object B07_StringInterpolation extends App {

  val aStr: String = "Hello, Welcome to scala"

  println("Index: " + aStr.charAt(2))
  println("Substring begin Index to end:" + aStr.substring(8))
  println("Substring specific Index to end: " + aStr.substring(8, 15))
  println("List of string after Split: " + aStr.split(" ").toList)
  println("Does starts with Hello: " + aStr.startsWith("Hello"))
  println("replace space with hyphen: " + aStr.replace(" ", "-"))

  val aStringInteger: String = "2"
  println(aStringInteger.toInt)
  println('a' +: aStringInteger :+ 'z')
  println("Reversed: " + aStr.reverse)
  println("First two alphabets: " + aStr.take(2))

  val name = "Shakir"
  val age = 26

  //String Interpolations

  // S - Interpolations
  val greetings = s"Hello, my name is $name and I'm $age years old!"
  val anotherGreetings = s"I will be turning ${age + 1} in ${6} months."
  println("Greetings: " + greetings);
  println("Another Greetings: " + anotherGreetings)

  // F - interpolation

  val speed = 125.2252f
  val myth = f"$name can eat $speed%4.2f burgers per minute"
  println("Myth: " + myth)
  val x = 22222
  println(f"$x%3d")
}
