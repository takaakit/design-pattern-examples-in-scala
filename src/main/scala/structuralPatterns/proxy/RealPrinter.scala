// ˅
package structuralPatterns.proxy

// ˄

class RealPrinter(name: String) extends Printer {
  // ˅
  heavyTask(f"Creating an instance($name) of the Printer")
  // ˄

  var printerName: String = name

  // Display a content with the name
  override def output(content: String) = {
    // ˅
    println(f"=== $printerName ===")
    println(content)
    // ˄
  }

  // Heavy task (Please think so...)
  private def heavyTask(message: String) = {
    // ˅
    print(message)
    for (i <- 0 to 10) {
      Thread.sleep(500)
      print(".")
    }
    println("Done.")
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
