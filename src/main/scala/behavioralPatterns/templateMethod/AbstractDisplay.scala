// ˅
package behavioralPatterns.templateMethod

// ˄

abstract class AbstractDisplay {
  // ˅
  
  // ˄

  def open()

  def write()

  def close()

  def output() = {
    // ˅
    open()
    for (i <- 0 to 4) {       // Repeat write 5 times
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
