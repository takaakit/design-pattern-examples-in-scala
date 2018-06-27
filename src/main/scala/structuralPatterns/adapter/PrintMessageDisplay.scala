// ˅
package structuralPatterns.adapter

// ˄

class PrintMessageDisplay(_message: String) extends MessageDisplay(_message) with Print {
  // ˅
  
  // ˄

  override def printWeak() = {
    // ˅
    displayWithHyphens()
    // ˄
  }

  override def printStrong() = {
    // ˅
    displayWithBrackets()
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
