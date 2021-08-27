// ˅
package structuralPatterns.bridge

// ˄

class MultiLineDisplay(_impl: DisplayImpl) extends Display(_impl) {
  // ˅
  
  // ˄

  // Repeat display for the specified number of times
  def outputMultiple(times: Int): Unit = {
    // ˅
    open()
    for (i <- 0 until times) {
      write()
    }
    close()
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
