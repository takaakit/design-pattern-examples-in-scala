// ˅
package structuralPatterns.adapter

// ˄

// Adapt the MessageDisplay interface to the Print interface.
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
