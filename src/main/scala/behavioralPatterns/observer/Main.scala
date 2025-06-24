package behavioralPatterns.observer

import scala.util.Random

/*
Observers observe a Subject object holding a numerical value and display the value.
The display formats are digits and bar charts.
*/

@main
def main(): Unit = {
  val numberSubject = new NumberSubject
  numberSubject.attach(new DigitObserver(numberSubject))
  numberSubject.attach(new BarChartObserver(numberSubject))

  val random = new Random
  for (i <- 0 until 20) {
    numberSubject.setValue(random.nextInt(50))
    Thread.sleep(200)
  }
}
