package lectures.basics
import scala.annotation.tailrec

object B04_Recursion extends App {

  def fibTailRec(n: Int): Int = {
    @tailrec
    def fibHelper(i: Int, next: Int, prev: Int): Int = {
      if (i >= n) next
      else fibHelper(i + 1, next + prev, next)
    }

    if (n <= 2) 1
    else fibHelper(2, 1, 1)

  }

  def fib(n: Int): Int = {
    if (n <= 2) 1
    else fib(n - 1) + fib(n - 2)
  }

  def isPrimeTailRec(n: Int): Boolean = {
    @tailrec
    def isPrimeHelper(i: Int, isPrime: Boolean): Boolean = {
      if (!isPrime) false
      else if (i <= 2) true
      else isPrimeHelper(i - 1, n % i != 0 && isPrime)
    }
    isPrimeHelper(n / 2, true)
  }

  def isPrime(n: Int): Boolean = {
    def isPrimeHelper(i: Int): Boolean = {
      if (i <= 1) true
      else n % i != 0 && isPrimeHelper(i - 1)
    }
    isPrimeHelper(n / 2)
  }
  println("Is Prime: " + isPrime(2))

  def concatTailRec(n: Int, aString: String): String = {
    @tailrec
    def concatHelper(n: Int, aString: String, accumulator: String): String = {
      if (n <= 0) accumulator
      else concatHelper(n - 1, aString, accumulator + aString)
    }
    concatHelper(n, aString, "")
  }

  def concat(n: Int, aString: String): String = {
    if (n <= 1) aString
    else aString + concat(n - 1, aString)
  }
  println(concat(5, "hello"))

  def factorialTailRec(n: Int): BigInt = {
    @tailrec
    def factorialHelper(n: Int, accumulator: BigInt): BigInt = {
      if (n <= 1) accumulator
      else factorialHelper(n - 1, n * accumulator)
    }
    factorialHelper(n, 1)
  }
  println(factorialTailRec(5))

  def factorial(n: Int): Int = {
    if (n <= 0) 1
    else n * factorial(n - 1)
  }
  println(factorial(3))

}
