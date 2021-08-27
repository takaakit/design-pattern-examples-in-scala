// ˅
package behavioralPatterns.templateMethod

// ˄

class StringDisplay(_string: String) extends AbstractDisplay {
  // ˅
  
  // ˄

  private val string: String = _string

  // String width
  private val width: Int = string.getBytes().length

  override def open(): Unit = {
    // ˅
    writeLine()             // Write a line
    // ˄
  }

  override def write(): Unit = {
    // ˅
    println(f"|$string|")    // Display the character with "|"
    // ˄
  }

  override def close(): Unit = {
    // ˅
    writeLine()              // Write a line
    // ˄
  }

  private def writeLine(): Unit = {
    // ˅
    print("+")              // Display an end mark "+"
    for (i <- 0 until width) {
      print("-")            // Display a line "-"
    }
    println("+")            // Display an end mark "+"
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
