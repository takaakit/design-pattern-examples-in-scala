// ˅
package behavioralPatterns.state

// ˄

trait State {
  // ˅
  
  // ˄

  def setTime(context: Context, hour: Int): Unit

  def use(context: Context): Unit

  def alarm(context: Context): Unit

  def phone(context: Context): Unit

  def toString(): String

  // ˅
  
  // ˄
}

// ˅

// ˄
