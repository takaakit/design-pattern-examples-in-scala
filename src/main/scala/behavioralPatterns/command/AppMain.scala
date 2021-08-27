// ˅
package behavioralPatterns.command

import javafx.application.Application
import javafx.stage.{Stage, WindowEvent}
import javafx.scene.control.Button
import javafx.scene.input.MouseEvent
import javafx.scene.Scene
import javafx.scene.layout.StackPane
import javafx.scene.layout.HBox

// ˄

class AppMain extends Application {
  // ˅
  
  // ˄

  // Painting history
  private val history: HistoryCommand = new HistoryCommand()

  private val canvas: PaintingCanvas = new PaintingCanvas(400.0, 300.0)

  override def start(primaryStage: Stage): Unit = {
    // ˅
    // Create buttons
    val undoButton: Button = new Button("Undo")
    undoButton.setOnMousePressed((event: MouseEvent) => undo())

    val clearButton: Button = new Button("Clear")
    clearButton.setOnMousePressed((event: MouseEvent) => clear())

    // Create panes
    val hBox: HBox = new HBox(undoButton, clearButton)
    val mainPane: StackPane = new StackPane()
    mainPane.getChildren.add(canvas)
    mainPane.getChildren.add(hBox)

    // Create a scene
    val scene: Scene = new Scene(mainPane)
    scene.setOnMouseDragged((event: MouseEvent) => onDragged(event.getSceneX, event.getSceneY))

    primaryStage.setTitle("Command Example")
    primaryStage.setScene(scene)
    primaryStage.setOnCloseRequest((event: WindowEvent) => {
      System.exit(0)
    })

    // Show
    primaryStage.show()
    // ˄
  }

  private def onDragged(x: Double, y: Double): Unit = {
    // ˅
    val paintingCommand = new PaintingCommand(canvas, x, y)
    history.add(paintingCommand)
    paintingCommand.execute()
    // ˄
  }

  private def undo(): Unit = {
    // ˅
    canvas.clear()
    history.undo()
    history.execute()
    // ˄
  }

  private def clear(): Unit = {
    // ˅
    canvas.clear()
    history.clear()
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
