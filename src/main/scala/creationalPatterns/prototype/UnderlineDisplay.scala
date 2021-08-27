// ˅
package creationalPatterns.prototype

import creationalPatterns.prototype.framework._

// ˄

class UnderlineDisplay(_underlineChar: Char) extends Display {
  // ˅
  
  // ˄

  private val underlineChar: Char = _underlineChar

  override def createClone(): Display = {
    // ˅
    new UnderlineDisplay(this.underlineChar)
    // ˄
  }

  override def show(message: String): Unit = {
    // ˅
    val length = message.getBytes.length
    println("\"" + message + "\"")
    print(" ")
    for (i <- 0 until length) {
      print(underlineChar)
    }
    println()
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
