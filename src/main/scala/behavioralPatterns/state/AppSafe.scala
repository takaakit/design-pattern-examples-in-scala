// ˅
package behavioralPatterns.state

import javafx.application.Application
import javafx.event.EventHandler
import javafx.geometry.Pos
import javafx.scene.Scene
import javafx.scene.control.TextField
import javafx.scene.control.TextArea
import javafx.scene.control.Button
import javafx.scene.input.MouseEvent
import javafx.scene.layout.HBox
import javafx.scene.layout.Pane
import javafx.scene.layout.VBox
import javafx.stage.{Stage, WindowEvent}
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

// ˄

class AppSafe extends Application with Context {
  // ˅
  
  // ˄

  // Current time
  private var textTime: TextField = null

  // Display of security center
  private var textMessage: TextArea = null

  // Current state
  private var state: State = DaytimeState

  override def start(primaryStage: Stage) = {
    // ˅
    textTime = new TextField("")
    textMessage = new TextArea("")

    val thisContext: Context = this

    val buttonUse: Button = new Button("Use a safe")
    buttonUse.setOnMouseClicked(new EventHandler[MouseEvent] {
      override def handle(event: MouseEvent): Unit = {
        state.useSafe(thisContext)      // Safe use button pressed
      }
    })

    val buttonAlarm: Button = new Button("Sound an emergency bell")
    buttonAlarm.setOnMouseClicked(new EventHandler[MouseEvent] {
      override def handle(event: MouseEvent): Unit = {
        state.soundBell(thisContext)   // Emergency bell button pressed
      }
    })

    val buttonPhone: Button = new Button("Make a call")
    buttonPhone.setOnMouseClicked(new EventHandler[MouseEvent] {
      override def handle(event: MouseEvent): Unit = {
        state.call(thisContext)        // Normal call button pressed
      }
    })

    val buttonExit: Button = new Button("Exit")
    buttonExit.setOnMouseClicked(new EventHandler[MouseEvent] {
      override def handle(event: MouseEvent): Unit = {
        System.exit(0)          // Exit button pressed
      }
    })

    val topPane: Pane = new Pane(textTime)
    val centerScreen: Pane = new Pane(textMessage)
    val bottomPane: HBox = new HBox(buttonUse, buttonAlarm, buttonPhone, buttonExit)
    bottomPane.setAlignment(Pos.BOTTOM_CENTER)
    val mainPane: VBox = new VBox(topPane, centerScreen, bottomPane)

    val scene: Scene = new Scene(mainPane)
    primaryStage.setScene(scene)
    primaryStage.setTitle("State Example")
    primaryStage.setOnCloseRequest(new EventHandler[WindowEvent] {
      override def handle(event: WindowEvent): Unit = {
        System.exit(0)
      }
    })

    // Show
    primaryStage.show()
    // ˄
  }

  // Set time
  override def setTime(hour: Int) = {
    // ˅
    var clockString = "Current Time : "
    if (hour < 10) {
      clockString += f"0$hour:00"
    }
    else {
      clockString += f"${hour.toString()}:00"
    }
    println(clockString)
    if (textTime != null) {
      textTime.setText(clockString)
    }
    state.setTime(this, hour)
    // ˄
  }

  // Change state
  override def changeState(state: State) = {
    // ˅
    println(f"The state changed from ${this.state.toString()} to $state.")
    this.state = state
    // ˄
  }

  // Call a security guard room
  override def callSecurityGuardsRoom(msg: String) = {
    // ˅
    textMessage.appendText(f"call! $msg\n")
    // ˄
  }

  // Record security log
  override def recordSecurityLog(msg: String) = {
    // ˅
    textMessage.appendText(f"record ... $msg\n")
    // ˄
  }

  // ˅
  Future {
    while (true) {
      for (hour <- 0 to 23) {
        setTime(hour) // Set the time
        Thread.sleep(1000)
      }
    }
  }
  // ˄
}

// ˅

// ˄
