// ˅
package behavioralPatterns.mediator

import javafx.event.EventHandler
import javafx.scene.control.Button
import javafx.scene.input.MouseEvent

// ˄

class ColleagueButton(caption: String) extends Button(caption) with Colleague {
  // ˅
  setOnMousePressed(new EventHandler[MouseEvent] {
    override def handle(event: MouseEvent): Unit = {
      mediator.colleagueChanged()
    }
  })
  // ˄

  override var mediator: Mediator = null

  // Set enable/disable from the Mediator
  override def setActivation(isEnable: Boolean) = {
    // ˅
    setDisable(!isEnable)
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
