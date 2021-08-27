// ˅
package structuralPatterns.bridge

// ˄

class TextDisplayImpl(_text: String) extends DisplayImpl {
  // ˅
  
  // ˄

  // A string to display
  private val text: String = _text

  // A number of characters in bytes
  private val width: Int = text.getBytes.length

  override def implOpen(): Unit = {
    // ˅
    printLine()
    // ˄
  }

  override def implWrite(): Unit = {
    // ˅
    println(f":$text:")                // Enclose a text with ":" and display it.
    // ˄
  }

  override def implClose(): Unit = {
    // ˅
    printLine()
    // ˄
  }

  private def printLine(): Unit = {
    // ˅
    print("*")                          // Display "*" mark at the beginning of a frame.
    for (i <- 0 until width) {          // Display "." for the number of "width".
      print(".")
    }
    println("*")                        // Display "*" mark at the end of a frame.
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
