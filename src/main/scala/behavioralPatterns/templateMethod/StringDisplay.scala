// ˅
package behavioralPatterns.templateMethod

// ˄

class StringDisplay(_string: String) extends AbstractDisplay {
  // ˅
  
  // ˄

  private val string: String = _string

  // String width
  private val width: Int = string.getBytes().size

  override def open() = {
    // ˅
    writeLine()             // Write a line
    // ˄
  }

  override def write() = {
    // ˅
    println(f"|$string|")    // Display the character with "|"
    // ˄
  }

  override def close() = {
    // ˅
    writeLine()              // Write a line
    // ˄
  }

  private def writeLine() = {
    // ˅
    print("+")              // Display an end mark "+"
    for (i <- 0 until width) {
      print("-")          // Display a line "-"
    }
    println("+")            // Display an end mark "+"
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
