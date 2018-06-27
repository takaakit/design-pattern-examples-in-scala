package structuralPatterns.proxy

// At the time of printing, create an instance of the printer for the first time.
// In order to spend time creating a printer, call a heavy task when creating a printer instance.

object Main {
  def main(args: Array[String]): Unit = {
    val p = new PrinterProxy("Emily's printer")
    println(f"The current printer is ${p.getPrinterName()}.")
    p.setPrinterName("William's printer")
    println(f"The current printer is ${p.getPrinterName()}.")
    p.output("Nice to meet you.")
  }
}
