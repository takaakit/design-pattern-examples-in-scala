// ˅
package behavioralPatterns.interpreter

// ˄

// A node corresponding to "forward", "left", and "right".
class Action extends Node {
  // ˅
  
  // ˄

  private var name: String = null

  override def parse(context: Context) = {
    // ˅
    name = context.getToken()
    context.slideToken(name)
    if (name != "forward" && name != "right" && name != "left") {
      throw new Exception(f"$name is unknown")
    }
    // ˄
  }

  override def toString(): String = {
    // ˅
    name
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
