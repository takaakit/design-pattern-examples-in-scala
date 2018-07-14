// ˅
package behavioralPatterns.state

// ˄

object NightState extends State {
  // ˅
  
  // ˄

  // Set time
  override def setTime(context: Context, hour: Int) = {
    // ˅
    if (9 <= hour && hour < 17) {
      context.changeState(DaytimeState)
    }
    // ˄
  }

  // Use a safe
  override def useSafe(context: Context) = {
    // ˅
    context.callSecurityGuardsRoom("Emergency: Use a safe at night!")
    // ˄
  }

  // Sound a emergency bell
  override def soundBell(context: Context) = {
    // ˅
    context.callSecurityGuardsRoom("Sound a emergency bell at night")
    // ˄
  }

  // Make a normal call
  override def call(context: Context) = {
    // ˅
    context.recordSecurityLog("Record a night call")
    // ˄
  }

  override def toString(): String = {
    // ˅
    "[Night]"
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
