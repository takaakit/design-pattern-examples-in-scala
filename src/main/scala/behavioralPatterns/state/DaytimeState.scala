// ˅
package behavioralPatterns.state

// ˄

object DaytimeState extends State {
  // ˅
  
  // ˄

  // Set time
  override def setTime(context: Context, hour: Int) = {
    // ˅
    if (hour < 9 || 17 <= hour) {
      context.changeState(NightState)
    }
    // ˄
  }

  // Use a safe
  override def useSafe(context: Context) = {
    // ˅
    context.recordSecurityLog("Use a safe in the daytime")
    // ˄
  }

  // Sound a emergency bell
  override def soundBell(context: Context) = {
    // ˅
    context.callSecurityGuardsRoom("Sound a emergency bell in the daytime")
    // ˄
  }

  // Make a normal call
  override def call(context: Context) = {
    // ˅
    context.callSecurityGuardsRoom("Make a normal call in the daytime")
    // ˄
  }

  override def toString(): String = {
    // ˅
    "[Daytime]"
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
