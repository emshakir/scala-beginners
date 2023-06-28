package lectures.basics

object B02_Expressions extends App {

  val x = 1 + 1 //Expressions
  println(x);

  // + - * / & | ^ << >> >>>(right shift with zero extension)
  println(1 + 2 * 3)

  // == != > >= < <=
  println(1 == x)

  // ! && ||
  println(!(1 == x))

  var aVariable = 2
  aVariable += 3

  // also works with -=, *=, /= ...... Side Effects
  println(aVariable)

  // Instructions (DO Something) vs Expressions( return something)

  val aCondition = true
  val aConditionValue = if (aCondition) 5 else 3;
  println(aConditionValue)

  // Everything in Scala is Expression(Give Something)

  val aWeirdValue = (aVariable = 5) // Unit == void in  Scala
  println(aWeirdValue)

  // Side Effects -> println(), whiles, reassigning..

  // Code Blocks: Special Expressions

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "Hello" else "Good Bye"
  }

  val someValue = {
    2 < 3
  }
  println(someValue) // true

  val someOtherValue = {
    if (someValue) 239 else 986
    45
  }
  println(someOtherValue) // 45

}

/*
  TAKE AWAYS
      - Code Blocks in Scala are Expressions
      - The Value of the block is the value of its last Expression

      Expression vs Instructions
        - Instructions are Executed(Java), Expression are evaluated(Scala)
        - In Scala we'll think in terms of expression

      NOTE: Do not use while loop in Scala Programs


  EXERCISE

      1. Difference between "Hello World" vs println("Hello World")
      A:    - Hello World is Value of type String - literal returns String
            - println("Hello World") is expression(side effect) returns Unit
 */
