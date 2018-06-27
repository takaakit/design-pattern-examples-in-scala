// ˅
package structuralPatterns.decorator

// ˄

abstract class Display {
  // ˅
  
  // ˄

  // Column width
  def columns(): Int

  // Number of rows
  def rows(): Int

  def getLineText(row: Int): String

  // Show all
  def show() = {
    // ˅
    for (i <- 0 until rows) {
      println(getLineText(i))
    }
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
