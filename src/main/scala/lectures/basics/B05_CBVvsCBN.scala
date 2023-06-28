package lectures.basics

object B05_CBVvsCBN extends App {

  def calledByValue(value: Int): Unit = {
    println(value)
    println(value)
  }

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
