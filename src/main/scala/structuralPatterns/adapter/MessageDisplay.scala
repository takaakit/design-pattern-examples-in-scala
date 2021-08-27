// ˅
package structuralPatterns.adapter

// ˄

class MessageDisplay(_message: String) {
  // ˅
  
  // ˄

  private val message: String = _message

  def displayWithHyphens(): Unit = {
    // ˅
    println(f"-- $message --")
    // ˄
  }

  def displayWithBrackets(): Unit = {
    // ˅
    println(f"[[ $message ]]")
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
