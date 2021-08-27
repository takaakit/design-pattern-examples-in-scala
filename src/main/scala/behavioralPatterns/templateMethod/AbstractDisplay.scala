// ˅
package behavioralPatterns.templateMethod

// ˄

abstract class AbstractDisplay {
  // ˅
  
  // ˄

  def open(): Unit

  def write(): Unit

  def close(): Unit

  def output(): Unit = {
    // ˅
    open()
    for (i <- 0 until 5) {       // Repeat write 5 times
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
