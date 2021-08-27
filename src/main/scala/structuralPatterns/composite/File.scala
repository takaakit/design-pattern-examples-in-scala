// ˅
package structuralPatterns.composite

// ˄

class File(_name: String, _size: Int) extends FileSystemElement {
  // ˅
  
  // ˄

  private val name: String = _name

  private val size: Int = _size

  override def getName(): String = {
    // ˅
    name
    // ˄
  }

  override def getSize(): Int = {
    // ˅
    size
    // ˄
  }

  // Print this element with the "upperPath".
  override def print(upperPath: String): Unit = {
    // ˅
    println(f"$upperPath/$this")
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
