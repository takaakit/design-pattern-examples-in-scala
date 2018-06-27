// ˅
package structuralPatterns.composite

// ˄

abstract class FileSystemElement {
  // ˅
  
  // ˄

  protected val name: String

  protected val size: Int

  // Print this element with the "upperPath".
  def print(upperPath: String)

  override def toString(): String = {
    // ˅
    f"$name ($size)"
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
