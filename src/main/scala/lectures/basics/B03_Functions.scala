package lectures.basics

object B03_Functions extends App {

  def aFunction(aString: String, n: Int): String = {
    aString + " " + n
  }
  println(aFunction("Hello", 5))

  def aParameterLessFunction(): Int = 42
  println(aParameterLessFunction())
  println(aParameterLessFunction)

  // IN SCALA WHEN YOU NEED LOOPS USE RECURSION
  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)
  }
  println(aRepeatedFunction("Hello", 3))

  def aFunctionWithSideEffects(): Unit =
    println("Void Function, Unit as return type!")

  def aBigFunction(n: Int): Int = {
    def aSmallInnerFunction(a: Int, b: Int): Int = a + b
    aSmallInnerFunction(n, n - 1)
  }
}
/*
    1. A Greeting Function (name, age) => "Hi, my name is name and I am age old"
    2. A Function which calculated product on n
    3. Fibonacci number for n
    4. Print prime Numbers
 */
