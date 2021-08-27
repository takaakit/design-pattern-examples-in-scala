// ˅
package behavioralPatterns.mediator

import javafx.scene.control.TextField
import javafx.scene.input.KeyEvent

// ˄

class ColleagueTextField(_textField: TextField) extends Colleague {
  // ˅

  // ˄

  private val textField: TextField = _textField

  // Set enable/disable from the Mediator
  override def setActivation(isEnable: Boolean): Unit = {
    // ˅
    this.textField.setDisable(!isEnable)
    // ˄
  }

  def isEmpty(): Boolean = {
    // ˅
    this.textField.getText.isEmpty
    // ˄
  }

  def getTextField(): TextField = {
    // ˅
    this.textField
    // ˄
  }

  // ˅
  this.textField.setOnKeyReleased((event: KeyEvent) => {
    mediator.colleagueChanged()
  })
  // ˄
}

// ˅

// ˄
