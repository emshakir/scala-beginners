package exercise

object Assignment_1 extends App {

  // Write a Greeting function which accepts args
  def greet(name: String, age: Int): Unit =
    println(s"Hi, my name is $name and I am $age years Old!")
  greet("Shakir", 26)

  // Product of n numbers
  def factorial(n: Int): Int = {
    if (n <= 0) 1
    else n * factorial(n - 1)
  }
  println(factorial(3))

  // Find the nth Fibonacci Number
  def nthFibonacci(n: Int) : Int = {
    if(n <= 2) 1
    else nthFibonacci(n - 1) + nthFibonacci(n - 2)
  }

  println(nthFibonacci(8))

  // Find does the number is Prime
  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if(t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)
    }
    isPrimeUntil(n / 2)
  }

  println(isPrime(56))
  println(isPrime(89))
  println(isPrime(57))

}
