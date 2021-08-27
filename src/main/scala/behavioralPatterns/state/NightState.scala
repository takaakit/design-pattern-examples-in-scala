// ˅
package behavioralPatterns.state

// ˄

object NightState extends State {
  // ˅
  
  // ˄

  override def setTime(context: Context, hour: Int): Unit = {
    // ˅
    if (9 <= hour && hour < 17) {
      context.changeState(DaytimeState)
    }
    // ˄
  }

  override def use(context: Context): Unit = {
    // ˅
    context.callSecurityGuardsRoom("Emergency: Use a safe at night!")
    // ˄
  }

  override def alarm(context: Context): Unit = {
    // ˅
    context.callSecurityGuardsRoom("Sound a emergency bell at night")
    // ˄
  }

  override def phone(context: Context): Unit = {
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
