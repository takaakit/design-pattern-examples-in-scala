// ˅
package behavioralPatterns.mediator

import javafx.scene.control.TextField
import javafx.event.EventHandler
import javafx.scene.input.KeyEvent

// ˄

class ColleagueTextField(text: String) extends TextField(text) with Colleague {
  // ˅
  setOnKeyReleased(new EventHandler[KeyEvent] {
    override def handle(event: KeyEvent): Unit = {
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
