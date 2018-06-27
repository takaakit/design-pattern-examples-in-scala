// ˅
package behavioralPatterns.mediator

// ˄

trait Colleague {
  // ˅
  
  // ˄

  var mediator: Mediator

  // Set enable/disable from the Mediator
  def setActivation(isEnable: Boolean)

  // ˅
  
  // ˄
}

// ˅

// ˄
