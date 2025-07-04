package behavioralPatterns.mediator

import javafx.application.Application

/*
Show a login dialog for entering a username and password. The dialog has the following elements:
* "Guest" and "Login" radio buttons
* "Username" and "Password" text fields
* "OK" and "Cancel" buttons

And change the editable properties of the elements depending on the state of the radio buttons and text fields.
*/

@main
def main(): Unit = {
  Application.launch(classOf[AppLogin])
}
