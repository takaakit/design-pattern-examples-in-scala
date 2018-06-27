// ˅
package creationalPatterns.prototype.framework

// ˄

trait Display extends Cloneable {
  // ˅
  
  // ˄

  def createClone(): Display

  def show(message: String)

  // ˅
  
  // ˄
}

// ˅

// ˄
