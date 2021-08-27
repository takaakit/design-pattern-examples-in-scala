// ˅
package structuralPatterns.proxy

// ˄

class RealPrinter(_name: String) extends Printer {
  // ˅

  // ˄

  var name: String = _name

  def getName(): String = {
    // ˅
    this.name
    // ˄
  }

  def changeName(name: String): Unit = {
    // ˅
    this.name = name
    // ˄
  }

  override def output(content: String): Unit = {
    // ˅
    println("==========")
    println(content)
    println("Printed by " + name)
    println("==========")
    // ˄
  }

  // Heavy task (Please think so...)
  private def heavyTask(message: String): Unit = {
    // ˅
    print(message)
    for (i <- 0 until 10) {
      Thread.sleep(500)
      print(".")
    }
    println("Done.")
    // ˄
  }

  // ˅
  heavyTask(f"Creating an instance($name) of the Printer")
  // ˄
}

// ˅

// ˄
