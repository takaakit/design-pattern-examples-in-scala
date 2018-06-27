package structuralPatterns.bridge

// Display only one line or display the specified number of lines.

object Main {
  def main(args: Array[String]): Unit = {
    val d1: Display = new Display(new TextDisplayImpl("Japan"))
    val d2: MultiLineDisplay = new MultiLineDisplay(new TextDisplayImpl("The United States of America"))
    val d3: MultiLineDisplay = new MultiLineDisplay(new TextDisplayImpl("Brazil"))
    d1.output()
    d2.output()
    d3.output()
    d3.displayMultiple(3)
  }
}
