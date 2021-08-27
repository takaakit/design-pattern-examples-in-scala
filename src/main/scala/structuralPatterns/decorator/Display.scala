// ˅
package structuralPatterns.decorator

// ˄

abstract class Display {
  // ˅
  
  // ˄

  // Column width
  def getColumns(): Int

  // Number of rows
  def getRows(): Int

  def getLineText(row: Int): String

  // Show all
  def show(): Unit = {
    // ˅
    for (i <- 0 until getRows()) {
      println(getLineText(i))
    }
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
