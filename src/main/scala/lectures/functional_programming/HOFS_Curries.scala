package lectures.functional_programming

object HOFS_Curries extends App {

  def superFunction: (Int, (String, (Int => Boolean)) => Int) => (Int => Int) =
    null

  def nTimes(f: Int => Int, n: Int, x: Int): Int = {
    if (n <= 0) x
    else nTimes(f, n - 1, f(x))
  }

  val plusOne = (x: Int) => x + 1
  println(nTimes(plusOne, 10, 1))

  def nTimesBetter(f: Int => Int, n: Int): (Int => Int) = {
    if (n <= 0) (x: Int) => x
    else (x: Int) => nTimesBetter(f, n - 1)(f(x))
  }

  val plus10 = nTimesBetter(plusOne, 10)
  println(plus10(1))
  println(nTimesBetter(plusOne, 10)(3))

  // Curried functions
  val superAdder: Int => (Int => Int) = (x: Int) => (y: Int) => x + y

  val add3 = superAdder(3)
  println(add3(5))
  println(superAdder(3)(5))

  // Functions with multiple parameters list

  def curriedFormatter(c: String)(d: Double): String = c.format(d)

  val standardFormatter: (Double => String) = curriedFormatter("%4.2f")
  val preciseFormatter: (Double => String) = curriedFormatter("%10.8f")

  val someVal = curriedFormatter("%10.8f")(Math.PI)
  println(standardFormatter(Math.PI))
  println(preciseFormatter(Math.PI))
  println(curriedFormatter("%1.6f")(Math.PI))
  println(curriedFormatter("%2.1f")(10.558))

}