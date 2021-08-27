// ˅
package behavioralPatterns.mediator

import javafx.event.ActionEvent
import javafx.scene.control.RadioButton

// ˄

class ColleagueRadioButton(_radioButton: RadioButton) extends Colleague {
  // ˅

  // ˄

  private val radioButton: RadioButton = _radioButton

  // Set enable/disable from the Mediator
  override def setActivation(isEnable: Boolean): Unit = {
    // ˅
    this.radioButton.setDisable(!isEnable)
    // ˄
  }

  def isSelected(): Boolean = {
    // ˅
    this.radioButton.isSelected
    // ˄
  }

  def getRadioButton(): RadioButton = {
    // ˅
    this.radioButton
    // ˄
  }

  // ˅
  this.radioButton.setOnAction((event: ActionEvent) => {
    mediator.colleagueChanged()
  })
  // ˄
}

// ˅

// ˄
