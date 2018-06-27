package behavioralPatterns.state

import javafx.application.Application

// Safe security system that the security status changes with time.

object Main {
  def main(args: Array[String]): Unit = {
    Application.launch(classOf[AppSafe], null)
  }
}
