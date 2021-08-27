// ˅
package behavioralPatterns.state

// ˄

object DaytimeState extends State {
  // ˅
  
  // ˄

  override def setTime(context: Context, hour: Int): Unit = {
    // ˅
    if (hour < 9 || 17 <= hour) {
      context.changeState(NightState)
    }
    // ˄
  }

  override def use(context: Context): Unit = {
    // ˅
    context.recordSecurityLog("Use a safe in the daytime")
    // ˄
  }

  override def alarm(context: Context): Unit = {
    // ˅
    context.callSecurityGuardsRoom("Sound a emergency bell in the daytime")
    // ˄
  }

  override def phone(context: Context): Unit = {
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
