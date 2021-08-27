package behavioralPatterns.command

import javafx.application.Application

/*
Simple drawing application:
* Draw a path with points by dragging the mouse.
* Revert to one previous drawing by pressing the Undo button.
* Erase all drawing by pressing the Clear button.
*/

object Main {
  def main(args: Array[String]): Unit = {
    Application.launch(classOf[AppMain], args: _*)
  }
}
