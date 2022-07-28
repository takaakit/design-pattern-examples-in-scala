// ˅
package structuralPatterns.proxy

// ˄

class ProxyPrinter(_name: String) extends Printer {
  // ˅
  
  // ˄

  private var currentName: String = _name

  // A printer that actually prints
  private var real: RealPrinter = null

  def getName(): String = {
    // ˅
    if (real != null) {
      real.getName()
    }
    else {
      this.currentName
    }
    // ˄
  }

  def changeName(name: String): Unit = {
    // ˅
    if (real != null) {
      real.changeName(name)
    }
    this.currentName = name
    // ˄
  }

  override def output(content: String): Unit = {
    // ˅
    if (real == null) {
      real = new RealPrinter(currentName)
    }
    real.output(content)
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
