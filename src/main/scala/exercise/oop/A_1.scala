package exercise.oop

object A_1 extends App {}

class Writer(firstName: String, surname: String, val year: Int) {

  def fullName() = surname + " " + firstName
}

class Novel(name: String, year: Int, author: Writer) {

  def authorAge() = year - author.year

  def isWrittenBy(author: Writer) = author == this.author

  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}

class Counter(val count: Int) {

  def inc = new Counter(count + 1)
  def dec = new Counter(count - 1)

  def inc(times: Int): Counter = {
    if (times <= 0) this
    else inc.inc(times - 1)
  }

  def dec(times: Int): Counter = {
    if (times <= 0) this
    else dec.dec(times - 1)
  }

  def print = println(count)

}
/*
    Implement a Novel and Writer call
          Writer:
            - First name
            - surname
            - YOB
          methods:
            - fullname

          Novel:
          Fields:
            - name
            - YOR
            - author(Writer)
          methods:
            - authorAge
            - isWrittenBy(Author)
            - copy (new year of release) = new Instance of Novel

    Counter Class
           - receives an Int Value
           - method - current count
           - method - increment/decrement count
           - method - increment/decrement count by amount received as param
 */
