// ˅
package structuralPatterns.adapter

// ˄

class PrintMessageDisplay(_message: String) extends MessageDisplay(_message) with Print {
  // ˅
  
  // ˄

  override def printWeak(): Unit = {
    // ˅
    displayWithHyphens()
    // ˄
  }

  override def printStrong(): Unit = {
    // ˅
    displayWithBrackets()
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
