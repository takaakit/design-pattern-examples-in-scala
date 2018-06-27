// ˅
package structuralPatterns.decorator

// ˄

class SideFrame(_display: Display, _frameChar: Char) extends Frame(_display) {
  // ˅
  
  // ˄

  // Decoration character
  private val frameChar: Char = _frameChar

  // Number of characters added left and right decoration characters
  override def columns(): Int = {
    // ˅
    1 + display.columns + 1
    // ˄
  }

  // Number of lines
  override def rows(): Int = {
    // ˅
    display.rows
    // ˄
  }

  override def getLineText(row: Int): String = {
    // ˅
    frameChar.toString() + display.getLineText(row) + frameChar.toString()
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
