// ˅
package behavioralPatterns.state

// ˄

trait Context {
  // ˅
  
  // ˄

  // Set time
  def setTime(hour: Int): Unit

  // Change state
  def changeState(state: State): Unit

  // Call a security guard room
  def callSecurityGuardsRoom(msg: String): Unit

  // Record security log
  def recordSecurityLog(msg: String): Unit

  // ˅
  
  // ˄
}

// ˅

// ˄
