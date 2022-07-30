// ˅
package structuralPatterns.proxy

// ˄

// ProxyPrinter forwards requests to RealPrinter when appropriate.
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
    // Check to see if the the RealPrinter had been created, create it if necessary.
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
