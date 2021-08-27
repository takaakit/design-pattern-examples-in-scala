// ˅
package behavioralPatterns.visitor

// ˄

abstract class FileSystemElement extends Element {
  // ˅
  
  // ˄

  def getName(): String

  def getSize(): Int

  override def toString(): String = {
    // ˅
    f"${getName()} (${getSize()})"
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
