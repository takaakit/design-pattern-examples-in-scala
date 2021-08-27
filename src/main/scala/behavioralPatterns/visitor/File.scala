// ˅
package behavioralPatterns.visitor

// ˄

class File(_name: String, _size: Int) extends FileSystemElement {
  // ˅
  
  // ˄

  // File name
  private val name: String = _name

  private val size: Int = _size

  // File name
  override def getName(): String = {
    // ˅
    name
    // ˄
  }

  // File size
  override def getSize(): Int = {
    // ˅
    size
    // ˄
  }

  override def accept(visitor: Visitor): Unit = {
    // ˅
    visitor.visit(this)
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
