// ˅
package behavioralPatterns.observer

import java.util.Random

// ˄

// Holds a value and notifies observers when the value is set.
class NumberSubject extends Subject {
  // ˅
  
  // ˄

  private var value: Int = 0

  def setValue(value: Int): Unit = {
    // ˅
    // Notify observers when the value is set.
    this.value = value
    notifyObservers()
    // ˄
  }

  def getValue(): Int = {
    // ˅
    this.value
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
