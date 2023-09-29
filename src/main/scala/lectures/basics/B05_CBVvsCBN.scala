package lectures.basics

object B05_CBVvsCBN extends App {

  // Value is passed as an argument and output will remain same for whole expression
  def calledByValue(value: Int): Unit = {
    println(value)
    println(value)
  }

  // Expression is passed as an argument i.e., System.nanoTime(), output changes based on expression passed as argument
  def calledByName(name: => Long): Unit = {
    println(name)
    println(name)
  }

  calledByValue(5)
  calledByName(System.nanoTime())

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int): Unit = println(x)

//  printFirst(infinite(), 5);
  printFirst(5, infinite())
}
