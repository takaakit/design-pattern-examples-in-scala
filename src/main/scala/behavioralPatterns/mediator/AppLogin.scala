// ˅
package behavioralPatterns.mediator

import javafx.application.Application
import javafx.geometry.Insets
import javafx.geometry.Pos
import javafx.stage.{Stage, WindowEvent}
import javafx.scene.Scene
import javafx.scene.layout.GridPane
import javafx.scene.layout.HBox
import javafx.scene.layout.VBox
import javafx.scene.control.Label
import javafx.scene.control.ToggleGroup
import javafx.event.EventHandler

// ˄

class AppLogin extends Application with Mediator {
  // ˅
  
  // ˄

  private var radioLogin: ColleagueRadioButton = null

  private var radioGuest: ColleagueRadioButton = null

  private var textUsername: ColleagueTextField = null

  private var textPassword: ColleagueTextField = null

  private var buttonOk: ColleagueButton = null

  private var buttonCancel: ColleagueButton = null

  override def start(primaryStage: Stage) = {
    // ˅
    // Create TextField, Button and RadioButton
    createColleagues()

    val groupt: ToggleGroup = new ToggleGroup()
    radioGuest.setToggleGroup(groupt)
    radioLogin.setToggleGroup(groupt)

    // Set a initial state
    radioGuest.setSelected(true)
    textUsername.setActivation(false)
    textPassword.setActivation(false)
    buttonOk.setActivation(false)
    buttonCancel.setActivation(true)

    // Create panes
    val checkBoxPane: HBox = new HBox(radioGuest, radioLogin)
    checkBoxPane.setSpacing(5.0)

    val textFieldPane: GridPane = new GridPane()
    textFieldPane.setHgap(5.0)
    textFieldPane.setVgap(2.0)
    textFieldPane.add(new Label("Username:"), 0, 0)
    textFieldPane.add(textUsername, 1, 0)
    textFieldPane.add(new Label("Password:"), 0, 1)
    textFieldPane.add(textPassword, 1, 1)

    val bottomPane: HBox = new HBox(buttonOk, buttonCancel)
    bottomPane.setSpacing(5.0)
    bottomPane.setAlignment(Pos.CENTER_RIGHT)

    val mainPane: VBox = new VBox(checkBoxPane, textFieldPane, bottomPane)
    mainPane.setSpacing(5.0)
    mainPane.setPadding(new Insets(5.0, 5.0, 5.0, 5.0))

    // Create a scene
    val scene: Scene = new Scene(mainPane)
    primaryStage.setScene(scene)
    primaryStage.setTitle("Mediator Example")
    primaryStage.setOnCloseRequest(new EventHandler[WindowEvent] {
      override def handle(event: WindowEvent): Unit = {
        System.exit(0)
      }
    })

    // Set mediators
    radioGuest.mediator = this
    radioLogin.mediator = this
    textUsername.mediator = this
    textPassword.mediator = this
    buttonOk.mediator = this
    buttonCancel.mediator = this

    // Show
    primaryStage.show()
    // ˄
  }

  override def createColleagues() = {
    // ˅
    radioGuest = new ColleagueRadioButton("Guest")
    radioLogin = new ColleagueRadioButton("Login")
    textUsername = new ColleagueTextField("")
    textPassword = new ColleagueTextField("")
    buttonOk = new ColleagueButton("OK")
    buttonCancel = new ColleagueButton("Cancel")
    // ˄
  }

  // Change enable/disable of the Colleagues when notified from the Mediators.
  override def colleagueChanged() = {
    // ˅
    if (buttonOk.isPressed == true
      || buttonCancel.isPressed == true) {
      System.exit(0)
    }
    else {
      if (radioGuest.isSelected == true) {    // Guest mode
        textUsername.setActivation(false)
        textPassword.setActivation(false)
        buttonOk.setActivation(true)
      }
      else {                                  // Login mode
        textUsername.setActivation(true)
        textPassword.setActivation(true)

        // Judge whether the changed Colleage is enabled or disabled
        if (textUsername.getText() != ""
          && textPassword.getText() != "") {
          buttonOk.setActivation(true)
        }
        else {
          buttonOk.setActivation(false)
        }
      }
    }
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
