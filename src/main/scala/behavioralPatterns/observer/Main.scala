package behavioralPatterns.observer

// Observers observe objects generating a numerical value and display the value.

object Main {
  def main(args: Array[String]): Unit = {
    val number = new RandomNumber()
    number.addObserver(new DigitObserver())
    number.addObserver(new BarChartObserver())
    number.generate()
  }
}
