package behavioralPatterns.templateMethod

/*
Display a character or string repeatedly 5 times.
*/

object Main {
  def main(args: Array[String]): Unit = {
    val display1 = new CharDisplay('H')
    display1.output()

    val display2 = new StringDisplay("Hello world.")
    display2.output()
  }
}
