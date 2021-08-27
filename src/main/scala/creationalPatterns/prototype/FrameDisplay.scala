// ˅
package creationalPatterns.prototype

import creationalPatterns.prototype.framework._

// ˄

class FrameDisplay(_borderChar: Char) extends Display {
  // ˅
  
  // ˄

  private val borderChar: Char = _borderChar

  override def createClone(): Display = {
    // ˅
    new FrameDisplay(this.borderChar)
    // ˄
  }

  override def show(message: String): Unit = {
    // ˅
    val length = message.getBytes.length
    for (i <- 0 until length + 4) {
      print(borderChar)
    }
    println()
    println(f"$borderChar $message $borderChar")
    for (i <- 0 until length + 4) {
      print(borderChar)
    }
    println()
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
