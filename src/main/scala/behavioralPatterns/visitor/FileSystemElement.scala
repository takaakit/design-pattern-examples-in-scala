// ˅
package behavioralPatterns.visitor

// ˄

abstract class FileSystemElement extends Element {
  // ˅
  
  // ˄

  val name: String

  def size(): Int

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
