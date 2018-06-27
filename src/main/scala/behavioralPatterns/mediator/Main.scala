package behavioralPatterns.mediator

import javafx.application.Application

// Login dialog for entering a username and password.

object Main {
  def main(args: Array[String]): Unit = {
    Application.launch(classOf[AppLogin], null)
  }
}
