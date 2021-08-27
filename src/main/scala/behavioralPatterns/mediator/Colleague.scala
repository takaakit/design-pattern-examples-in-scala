// ˅
package behavioralPatterns.mediator

// ˄

abstract class Colleague {
  // ˅
  
  // ˄

  var mediator: Mediator = null

  // Set enable/disable from the Mediator
  def setActivation(isEnable: Boolean): Unit

  // ˅
  
  // ˄
}

// ˅

// ˄
