// ˅
package structuralPatterns.decorator

// ˄

class SideFrame(_display: Display, _frameChar: Char) extends Frame(_display) {
  // ˅
  
  // ˄

  // Decoration character
  private val frameChar: Char = _frameChar

  // Number of characters added left and right decoration characters
  override def getColumns(): Int = {
    // ˅
    1 + display.getColumns() + 1
    // ˄
  }

  // Number of lines
  override def getRows(): Int = {
    // ˅
    display.getRows()
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
