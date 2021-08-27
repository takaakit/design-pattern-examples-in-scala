// ˅
package behavioralPatterns.observer

import java.util.Random

// ˄

class NumberSubject extends Subject {
  // ˅
  
  // ˄

  private var value: Int = 0

  def setValue(value: Int): Unit = {
    // ˅
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
