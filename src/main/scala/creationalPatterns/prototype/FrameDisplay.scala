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
    println(borderChar.toString.repeat(message.getBytes.length + 4))
    println(f"$borderChar $message $borderChar")
    println(borderChar.toString.repeat(message.getBytes.length + 4))
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
