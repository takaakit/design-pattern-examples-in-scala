// ˅
package behavioralPatterns.mediator

import javafx.scene.control.RadioButton
import javafx.event.{ActionEvent, EventHandler}

// ˄

class ColleagueRadioButton(caption: String) extends RadioButton(caption) with Colleague {
  // ˅
  setOnAction(new EventHandler[ActionEvent] {
    override def handle(event: ActionEvent): Unit = {
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
