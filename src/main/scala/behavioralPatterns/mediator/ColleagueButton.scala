// ˅
package behavioralPatterns.mediator

import javafx.scene.control.Button
import javafx.scene.input.MouseEvent

// ˄

class ColleagueButton(_button: Button) extends Colleague {
  // ˅

  // ˄

  private val button: Button = _button

  // Set enable/disable from the Mediator
  override def setActivation(isEnable: Boolean): Unit = {
    // ˅
    this.button.setDisable(!isEnable)
    // ˄
  }

  def isPressed(): Boolean = {
    // ˅
    this.button.isPressed
    // ˄
  }

  def getButton(): Button = {
    // ˅
    this.button
    // ˄
  }

  // ˅
  this.button.setOnMousePressed((event: MouseEvent) => {
    mediator.colleagueChanged()
  })
  // ˄
}

// ˅

// ˄
