// ˅
package structuralPatterns.bridge

// ˄

class Display(_impl: DisplayImpl) {
  // ˅
  
  // ˄

  private val impl: DisplayImpl = _impl

  def output() = {
    // ˅
    open()
    write()
    close()
    // ˄
  }

  protected def open() = {
    // ˅
    impl.implOpen()
    // ˄
  }

  protected def write() = {
    // ˅
    impl.implWrite()
    // ˄
  }

  protected def close() = {
    // ˅
    impl.implClose()
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
