// ˅
package structuralPatterns.decorator

// ˄

class FullFrame(_display: Display) extends Frame(_display) {
  // ˅
  
  // ˄

  // Number of characters added left and right decoration characters
  override def columns(): Int = {
    // ˅
    1 + display.columns + 1
    // ˄
  }

  // Number of rows added the upper and lower decoration lines
  override def rows(): Int = {
    // ˅
    1 + display.rows + 1
    // ˄
  }

  override def getLineText(row: Int): String = {
    // ˅
    if (row == 0) {
      f"+${createLine('-', display.columns)}+" // Upper frame
    }
    else if (row == display.rows + 1) {
      f"+${createLine('-', display.columns)}+" // Bottom frame
    }
    else {
      f"|${display.getLineText(row - 1)}|"       // Other
    }
    // ˄
  }

  private def createLine(ch: Char, size: Int): String = {
    // ˅
    val buf = new StringBuffer()
    for (i <- 0 until size) {
      buf.append(ch)
    }
    buf.toString()
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
