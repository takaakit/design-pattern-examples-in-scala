// ˅
package behavioralPatterns.visitor

// ˄

class File(_name: String, _size: Int) extends FileSystemElement {
  // ˅
  
  // ˄

  // File name
  override val name: String = _name

  override def size(): Int = {
    // ˅
    _size
    // ˄
  }

  override def accept(visitor: Visitor) = {
    // ˅
    visitor.visit(this)
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
