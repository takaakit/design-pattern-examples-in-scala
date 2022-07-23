// ˅
package creationalPatterns.prototype.framework

import scala.collection.mutable.Map

// ˄

class Manager {
  // ˅
  
  // ˄

  private val display: Map[String, Display] = Map[String, Display]()

  def registerDisplay(displayName: String, display: Display): Unit = {
    // ˅
    this.display.put(displayName, display)
    // ˄
  }

  def getDisplay(displayName: String): Display = {
    // ˅
    val d: Display = this.display.apply(displayName)
    d.createClone()     // Create a new object by asking a concrete class to clone itself. Therefore, do not need to know the concrete Display class name.
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
