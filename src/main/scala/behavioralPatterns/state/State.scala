// ˅
package behavioralPatterns.state

// ˄

trait State {
  // ˅
  
  // ˄

  // Set time
  def setTime(context: Context, hour: Int)

  // Use a safe
  def useSafe(context: Context)

  // Sound a emergency bell
  def soundBell(context: Context)

  // Make a normal call
  def call(context: Context)

  // ˅
  
  // ˄
}

// ˅

// ˄
