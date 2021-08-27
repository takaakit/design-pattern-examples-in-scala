// ˅
package structuralPatterns.bridge

// ˄

class Display(_impl: DisplayImpl) {
  // ˅
  
  // ˄

  private val impl: DisplayImpl = _impl

  def output(): Unit = {
    // ˅
    open()
    write()
    close()
    // ˄
  }

  protected def open(): Unit = {
    // ˅
    impl.implOpen()
    // ˄
  }

  protected def write(): Unit = {
    // ˅
    impl.implWrite()
    // ˄
  }

  protected def close(): Unit = {
    // ˅
    impl.implClose()
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
