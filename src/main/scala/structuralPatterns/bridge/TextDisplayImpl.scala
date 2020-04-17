// ˅
package structuralPatterns.bridge

// ˄

class TextDisplayImpl(_text: String) extends DisplayImpl {
  // ˅
  
  // ˄

  // A string to display
  private val text: String = _text

  // A number of characters in bytes
  private val width: Int = text.getBytes.size

  override def implOpen() = {
    // ˅
    printLine()
    // ˄
  }

  override def implWrite() = {
    // ˅
    println(f":$text:")                // Enclose a text with ":" and display it.
    // ˄
  }

  override def implClose() = {
    // ˅
    printLine()
    // ˄
  }

  private def printLine() = {
    // ˅
    print("*")                          // Display "*" mark at the beginning of a frame.
    for (i <- 0 until width) {          // Display "." for the number of "width".
      print(".")
    }
    print("*\n")                        // Display "*" mark at the end of a frame.
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
