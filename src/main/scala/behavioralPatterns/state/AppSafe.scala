// ˅
package behavioralPatterns.state

import javafx.application.Application
import javafx.geometry.Pos
import javafx.scene.Scene
import javafx.scene.control.{Button, TextArea, TextField}
import javafx.scene.input.MouseEvent
import javafx.scene.layout.{HBox, Pane, VBox}
import javafx.stage.{Stage, WindowEvent}

// ˄

// Safe security system that the security status changes with time.
class AppSafe extends Application with Context {
  // ˅
  
  // ˄

  // Current state
  private var state: State = DaytimeState

  // Current time
  private var textTime: TextField = null

  // Display of security center
  private var textMessage: TextArea = null

  override def start(primaryStage: Stage): Unit = {
    // ˅
    textTime = new TextField("")
    textTime.setEditable(false)

    textMessage = new TextArea("")
    textMessage.setEditable(false)

    val buttonUse: Button = new Button("Use")
    buttonUse.setOnMouseClicked((event: MouseEvent) => {
      pressedUseButton()
    })

    val buttonAlarm: Button = new Button("Alarm")
    buttonAlarm.setOnMouseClicked((event: MouseEvent) => {
      pressedAlarmButton()
    })

    val buttonPhone: Button = new Button("Phone")
    buttonPhone.setOnMouseClicked((event: MouseEvent) => {
      pressedPhoneButton()
    })

    val topPane: Pane = new Pane(textTime)
    val centerScreen: Pane = new Pane(textMessage)
    val bottomPane: HBox = new HBox(buttonUse, buttonAlarm, buttonPhone)
    bottomPane.setAlignment(Pos.BOTTOM_CENTER)
    val mainPane: VBox = new VBox(topPane, centerScreen, bottomPane)

    val scene: Scene = new Scene(mainPane)
    primaryStage.setScene(scene)
    primaryStage.setTitle("State Example")
    primaryStage.setOnCloseRequest((event: WindowEvent) => {
      System.exit(0)
    })

    // Show
    primaryStage.show()
    // ˄
  }

  // Set time
  override def setTime(hour: Int): Unit = {
    // ˅
    var clockString = "Current Time : "
    if (hour < 10) {
      clockString += f"0$hour:00"
    }
    else {
      clockString += f"$hour:00"
    }
    println(clockString)
    if (textTime != null) {
      textTime.setText(clockString)
    }
    state.setTime(this, hour)
    // ˄
  }

  // Change state
  override def changeState(state: State): Unit = {
    // ˅
    println(f"The state changed from ${this.state} to $state.")
    this.state = state
    // ˄
  }

  // Call a security guard room
  override def callSecurityGuardsRoom(msg: String): Unit = {
    // ˅
    textMessage.appendText(f"call! $msg${System.getProperty("line.separator")}")
    // ˄
  }

  // Record security log
  override def recordSecurityLog(msg: String): Unit = {
    // ˅
    textMessage.appendText(f"record ... $msg${System.getProperty("line.separator")}")
    // ˄
  }

  private def pressedUseButton(): Unit = {
    // ˅
    state.use(this)
    // ˄
  }

  private def pressedAlarmButton(): Unit = {
    // ˅
    state.alarm(this)
    // ˄
  }

  private def pressedPhoneButton(): Unit = {
    // ˅
    state.phone(this)
    // ˄
  }

  // ˅
  new Thread(() => {
    while (true) {
      // Advance one hour for every second of real time.
      for (hour <- 0 to 23) {
        setTime(hour) // Set the time
        Thread.sleep(1000)
      }
    }
  }).start()
  // ˄
}

// ˅

// ˄
