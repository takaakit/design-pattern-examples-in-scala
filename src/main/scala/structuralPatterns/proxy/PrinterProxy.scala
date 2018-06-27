// ˅
package structuralPatterns.proxy

// ˄

class PrinterProxy(_name: String) extends Printer {
  // ˅
  
  // ˄

  private var currentName: String = _name

  // A printer that actually prints
  private var real: RealPrinter = null

  def getPrinterName(): String = {
    // ˅
    this.currentName
    // ˄
  }

  def setPrinterName(value: String) = {
    // ˅
    if (real != null) {
      real.printerName = value
    }
    this.currentName = value
    // ˄
  }

  override def output(content: String) = {
    // ˅
    createPrinter()
    real.output(content)
    // ˄
  }

  // Create an actual printer
  private def createPrinter() = {
    // ˅
    if (real == null) {
      real = new RealPrinter(currentName)
    }
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
