// ˅
package behavioralPatterns.state

// ˄

trait Context {
  // ˅
  
  // ˄

  // Set time
  def setTime(hour: Int)

  // Change state
  def changeState(state: State)

  // Call a security guard room
  def callSecurityGuardsRoom(msg: String)

  // Record security log
  def recordSecurityLog(msg: String)

  // ˅
  
  // ˄
}

// ˅

// ˄
