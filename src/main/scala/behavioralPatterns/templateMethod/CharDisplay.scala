// ˅
package behavioralPatterns.templateMethod

// ˄

class CharDisplay(_char: Char) extends AbstractDisplay {
  // ˅
  
  // ˄

  private val char: Char = _char

  override def open(): Unit = {
    // ˅
    print("<<")         // Display "<<" in the start characters.
    // ˄
  }

  override def write(): Unit = {
    // ˅
    print(char)         // Display the character.
    // ˄
  }

  override def close(): Unit = {
    // ˅
    println(">>")       // Display ">>" in the end characters.
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
