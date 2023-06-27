package lectures.basics

object Basics_01_ValuesVariablesTypes extends App {

  val x: Int = 42
  println(x)

  // Values are Immutable(constants) in scala, so if we re-initialize them, compiler will complain
  //x = 50

  // Compiler can Infer the Type based on assigned value so no need to specifically mention type
  val anString: String = "Hello Scala!"

  // Characters
  val aString = "Hello Scala!"
  val aCharacter: Char = 'a'

  // Boolean
  val aBoolean: Boolean = true

  // Numbers
  val anInteger: Int = 50
  val aShort: Short = 5555
  val aLong: Long = 4444444455L

  //Decimals
  val aFloat: Float = 52f
  val aDouble: Double = 458.524

  // Variables: Which are Mutable we can re-initialize a Variable which can also be called side-effects

  var aVarInt: Int = 88
  aVarInt = 99


  /*
    - Prefer vals Over vars
    - all vals and vars have Types
    - Compiler automatically infer types when omitted
    - Basic Types:
      - Boolean
      - Int, Short, Long
      - Float, Double
      - String, Char
   */
}
