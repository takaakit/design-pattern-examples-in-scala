// ˅
package structuralPatterns.bridge

// ˄

class MultiLineDisplay(_impl: DisplayImpl) extends Display(_impl) {
  // ˅
  
  // ˄

  // Repeat display for the specified number of times
  def displayMultiple(times: Int) = {
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
