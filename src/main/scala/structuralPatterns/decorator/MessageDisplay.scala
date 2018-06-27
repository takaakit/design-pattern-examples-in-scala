// ˅
package structuralPatterns.decorator

// ˄

class MessageDisplay(_message: String) extends Display {
  // ˅
  
  // ˄

  // Message to be displayed
  private val message: String = _message

  // Number of characters
  override def columns(): Int = {
    // ˅
    message.getBytes.size
    // ˄
  }

  // The number of rows is 1
  override def rows(): Int = {
    // ˅
    1
    // ˄
  }

  override def getLineText(row: Int): String = {
    // ˅
    if (row == 0) {
      message
    }
    else {
      null
    }
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
