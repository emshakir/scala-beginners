package lectures.functional_programming

object MapFlatMapFilters extends App {

  val list = List(1, 2, 3)

  println(list.head)
  println(list.tail)

  println(list.map(_ + 1))

  println(list.filter(_ % 2 == 0))

  val toPair = (x: Int) => List(x, x + 1)
  println(list.flatMap(toPair))

  val numbers = List(1, 2, 3)
  val chars = List('a', 'b', 'c')
  val colors = List("Black", "white")

  val res = numbers.flatMap(n => chars.map(c => c + "" + n))

  val result = numbers.flatMap(
    n => chars.flatMap(c => colors.map(color => c + "" + n + "_" + color))
  )
  println(res)
  println(result)

  val forComprehension = for {
    n <- numbers if n % 2 == 0
    c <- chars
    color <- colors
  } yield c + "" + n + "_" + color

  println(forComprehension)

  for {
    n <- numbers
  } println(n)

  list.map { x =>
    x * 2
  }
}
