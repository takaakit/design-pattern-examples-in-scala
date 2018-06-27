// ˅
package structuralPatterns.adapter

// ˄

class MessageDisplay(_message: String) {
  // ˅
  
  // ˄

  private val message: String = _message

  def displayWithHyphens() = {
    // ˅
    println(f"-- $message --")
    // ˄
  }

  def displayWithBrackets() = {
    // ˅
    println(f"[[ $message ]]")
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
