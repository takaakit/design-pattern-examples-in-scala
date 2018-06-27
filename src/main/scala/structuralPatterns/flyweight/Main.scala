package structuralPatterns.flyweight

// First, create instances for displaying large size characters, then display large size character string using that instances.

object Main {
  def main(args: Array[String]): Unit = {
    if (args.size != 1) {
      println("Usage: java Main digits")
      println("Ex.  : java Main 1212123")
    }
    else {
      val bs = new LargeSizeString(args.apply(0))
      bs.display()
    }
  }
}
