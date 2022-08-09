// ˅
package structuralPatterns.decorator

// ˄

class FullFrame(_display: Display) extends Frame(_display) {
  // ˅
  
  // ˄

  // Number of characters added left and right decoration characters
  override def getColumns(): Int = {
    // ˅
    1 + display.getColumns() + 1
    // ˄
  }

  // Number of rows added the upper and lower decoration lines
  override def getRows(): Int = {
    // ˅
    1 + display.getRows() + 1
    // ˄
  }

  override def getLineText(row: Int): String = {
    // ˅
    if (row == 0) {
      f"+${createLine('-', display.getColumns())}+" // Upper frame
    }
    else if (row == display.getRows() + 1) {
      f"+${createLine('-', display.getColumns())}+" // Bottom frame
    }
    else {
      f"|${display.getLineText(row - 1)}|"       // Other
    }
    // ˄
  }

  private def createLine(ch: Char, size: Int): String = {
    // ˅
    ch.toString.repeat(size)
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
