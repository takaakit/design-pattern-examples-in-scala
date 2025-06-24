package behavioralPatterns.templateMethod

/*
Display a character or string repeatedly 5 times.
*/

@main
def main(): Unit = {
  val display1 = new CharDisplay('H')
  display1.output()

  val display2 = new StringDisplay("Hello world.")
  display2.output()
}
