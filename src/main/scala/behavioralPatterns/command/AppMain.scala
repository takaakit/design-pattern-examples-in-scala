// ˅
package behavioralPatterns.command

import javafx.application.Application
import javafx.stage.{Stage, WindowEvent}
import javafx.scene.control.Button
import javafx.scene.input.MouseEvent
import javafx.scene.Scene
import javafx.scene.layout.StackPane
import javafx.scene.layout.HBox
import javafx.event.EventHandler

// ˄

class AppMain extends Application {
  // ˅
  
  // ˄

  // Painting history
  private val history: HistoryCommand = new HistoryCommand()

  private val canvas: PaintingCanvas = new PaintingCanvas(400.0, 300.0)

  override def start(primaryStage: Stage) = {
    // ˅
    // Create buttons
    val clearButton: Button = new Button("clear")
    clearButton.setOnMousePressed(new EventHandler[MouseEvent] {
      override def handle(event: MouseEvent): Unit = {
        canvas.clear()
        history.clear()
      }
    })

    val undoButton: Button = new Button("undo")
    undoButton.setOnMousePressed(new EventHandler[MouseEvent] {
      override def handle(event: MouseEvent): Unit = {
        canvas.clear()
        history.undo()
        history.execute()
      }
    })

    // Create panes
    val hBox: HBox = new HBox(undoButton, clearButton)
    val mainPane: StackPane = new StackPane()
    mainPane.getChildren.add(canvas)
    mainPane.getChildren.add(hBox)

    // Create a scene
    val scene: Scene = new Scene(mainPane)
    scene.setOnMouseDragged(new EventHandler[MouseEvent] {
      override def handle(event: MouseEvent): Unit = {
        val paintingCommand = new PaintingCommand(canvas, event.getSceneX, event.getSceneY)
        history.add(paintingCommand)
        paintingCommand.execute()
      }
    })

    primaryStage.setTitle("Command Example")
    primaryStage.setScene(scene)
    primaryStage.setOnCloseRequest(new EventHandler[WindowEvent] {
      override def handle(event: WindowEvent): Unit = {
        System.exit(0)
      }
    })

    // Show
    primaryStage.show()
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
