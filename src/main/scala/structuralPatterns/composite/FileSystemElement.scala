// ˅
package structuralPatterns.composite

// ˄

abstract class FileSystemElement {
  // ˅
  
  // ˄

  def getName(): String

  def getSize(): Int

  // Print this element with the "upperPath".
  def print(upperPath: String): Unit

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
