// ˅
package creationalPatterns.prototype.framework

import scala.collection.mutable.Map

// ˄

class Manager {
  // ˅
  
  // ˄

  private val display: Map[String, Display] = Map[String, Display]()

  def registerDisplay(displayName: String, display: Display) = {
    // ˅
    this.display.put(displayName, display)
    // ˄
  }

  def getDisplay(displayName: String): Display = {
    // ˅
    val d: Display = this.display.apply(displayName)
    d.createClone()
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
