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
import javafx.scene.control.{Button, Label, PasswordField, RadioButton, TextField, ToggleGroup}

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

  override def start(primaryStage: Stage): Unit = {
    // ˅
    // Create TextField, Button and RadioButton
    createColleagues()

    val toggleGroup: ToggleGroup = new ToggleGroup()
    radioGuest.getRadioButton().setToggleGroup(toggleGroup)
    radioLogin.getRadioButton().setToggleGroup(toggleGroup)

    // Set a initial state
    radioGuest.getRadioButton().setSelected(true)
    textUsername.setActivation(false)
    textPassword.setActivation(false)
    buttonOk.setActivation(true)
    buttonCancel.setActivation(true)

    // Create panes
    val checkBoxPane: HBox = new HBox(radioGuest.getRadioButton(), radioLogin.getRadioButton())
    checkBoxPane.setSpacing(5.0)

    val textFieldPane: GridPane = new GridPane()
    textFieldPane.setHgap(5.0)
    textFieldPane.setVgap(2.0)
    textFieldPane.add(new Label("Username:"), 0, 0)
    textFieldPane.add(textUsername.getTextField(), 1, 0)
    textFieldPane.add(new Label("Password:"), 0, 1)
    textFieldPane.add(textPassword.getTextField(), 1, 1)

    val bottomPane: HBox = new HBox(buttonOk.getButton(), buttonCancel.getButton())
    bottomPane.setSpacing(5.0)
    bottomPane.setAlignment(Pos.CENTER_RIGHT)

    val mainPane: VBox = new VBox(checkBoxPane, textFieldPane, bottomPane)
    mainPane.setSpacing(5.0)
    mainPane.setPadding(new Insets(5.0, 5.0, 5.0, 5.0))

    // Create a scene
    val scene: Scene = new Scene(mainPane)
    primaryStage.setScene(scene)
    primaryStage.setTitle("Mediator Example")
    primaryStage.setOnCloseRequest((event: WindowEvent) => {
      System.exit(0)
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

  override def createColleagues(): Unit = {
    // ˅
    radioGuest = new ColleagueRadioButton(new RadioButton("Guest"))
    radioLogin = new ColleagueRadioButton(new RadioButton("Login"))
    textUsername = new ColleagueTextField(new TextField)
    textPassword = new ColleagueTextField(new PasswordField)
    buttonOk = new ColleagueButton(new Button("OK"))
    buttonCancel = new ColleagueButton(new Button("Cancel"))
    // ˄
  }

  // Change enable/disable of the Colleagues when notified from the Mediators.
  override def colleagueChanged(): Unit = {
    // ˅
    if (buttonOk.isPressed() || buttonCancel.isPressed()) {
      System.exit(0)
    }
    else {
      if (radioGuest.isSelected()) {  // Guest mode
        textUsername.setActivation(false)
        textPassword.setActivation(false)
        buttonOk.setActivation(true)
      }
      else {  // Login mode
        textUsername.setActivation(true)
        textPassword.setActivation(true)

        // Judge whether the changed Colleague is enabled or disabled
        if (!textUsername.isEmpty() && !textPassword.isEmpty()) {
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
