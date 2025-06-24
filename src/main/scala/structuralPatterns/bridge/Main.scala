package structuralPatterns.bridge

/*
Display only one line or display the specified number of lines.
*/

@main
def main(): Unit = {
  val d1 = new Display(new TextDisplayImpl("Japan"))
  d1.output()

  val d2 = new MultiLineDisplay(new TextDisplayImpl("The United States of America"))
  d2.output()
  d2.outputMultiple(3)
}
