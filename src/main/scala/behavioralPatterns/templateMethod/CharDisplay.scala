// ˅
package behavioralPatterns.templateMethod

// ˄

class CharDisplay(_char: Char) extends AbstractDisplay {
  // ˅
  
  // ˄

  private val char: Char = _char

  override def open() = {
    // ˅
    print("<<")         // Display "<<" in the start characters.
    // ˄
  }

  override def write() = {
    // ˅
    print(char)         // Display the character.
    // ˄
  }

  override def close() = {
    // ˅
    println(">>")       // Display ">>" in the end characters.
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
