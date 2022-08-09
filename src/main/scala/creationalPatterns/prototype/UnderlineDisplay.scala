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
    println("\"" + message + "\"")
    println(f" ${underlineChar.toString.repeat(message.getBytes.length)}")
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
