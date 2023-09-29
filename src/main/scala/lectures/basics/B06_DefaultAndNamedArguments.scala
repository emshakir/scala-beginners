package lectures.basics

object B06_DefaultAndNamedArguments {

  // Need tp pass the constant value all the time for every function call
  def fac(x: Int, acc: Int): Int =
    if (x <= 1) acc
    else fac(x - 1, x * acc)
  fac(5, 1)

  // We can provide the default value and also pass the value which will override
  def fact(n: Int, acc: Int = 1): Int = {
    if (n <= 1) acc
    else fac(n - 1, n * acc)
  }
  fact(5)

  def savePicture(picture: String = "jpeg", width: Int, height: Int): Unit =
    println("Saved!")

  /*
      Here whenever we defined first argument as default there could be issue while making a function call
      however we can make use of named argument by specifying name so that the compiler won't be confused

      NOTE: We can give parameters at any position, while using named arguments
   */

  savePicture(width = 1080, height = 1024)
  savePicture(height = 2048, width = 1024, picture = "png")

}
