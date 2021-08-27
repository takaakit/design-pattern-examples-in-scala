package creationalPatterns.prototype

import creationalPatterns.prototype.framework._

/*
Display a string enclosed with a frame line, or drawn with an underline. The Client (Main)
registers instances of the Display subclass in the Manager class. When necessary,
the Manager class asks those registered instances to return a clone. The Client (Main)
requires the returned clones to display.
*/

object Main {
  def main(args: Array[String]): Unit = {
    val manager = new Manager

    // Register instances of the "Display" subclass
    val emphasisUnderline = new UnderlineDisplay('~')
    manager.registerDisplay("emphasis", emphasisUnderline)
    val highlightFrame = new FrameDisplay('+')
    manager.registerDisplay("highlight", highlightFrame)
    val warningFrame = new FrameDisplay('#')
    manager.registerDisplay("warning", warningFrame)

    // Require to display
    val display1 = manager.getDisplay("emphasis")
    display1.show("Nice to meet you.")
    val display2 = manager.getDisplay("highlight")
    display2.show("Nice to meet you.")
    val display3 = manager.getDisplay("warning")
    display3.show("Nice to meet you.")
  }
}
