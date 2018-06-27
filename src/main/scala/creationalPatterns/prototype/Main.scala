package creationalPatterns.prototype

import creationalPatterns.prototype.framework._

// Display a character string enclosed with a frame line, or drawn with an underline.

object Main {
  def main(args: Array[String]): Unit = {
    // Create a manager
    val manager = new Manager()
    val emphasisUnderline = new UnderlineDisplay('~')
    val highlightFrame = new FrameDisplay('+')
    val warningFrame = new FrameDisplay('#')
    manager.registerDisplay("emphasis", emphasisUnderline.asInstanceOf[Display])
    manager.registerDisplay("highlight", highlightFrame.asInstanceOf[Display])
    manager.registerDisplay("warning", warningFrame.asInstanceOf[Display])

    // Create displays
    val display1 = manager.getDisplay("emphasis")
    display1.show("Nice to meet you.")
    val display2 = manager.getDisplay("highlight")
    display2.show("Nice to meet you.")
    val display3 = manager.getDisplay("warning")
    display3.show("Nice to meet you.")
  }
}
