// ˅
package behavioralPatterns.observer

// ˄

// Display values with a bar chart.
class BarChartObserver(_numberSubject: NumberSubject) extends Observer {
  // ˅
  
  // ˄

  private val numberSubject: NumberSubject = _numberSubject

  override def update(changedSubject: Subject): Unit = {
    // ˅
    // Before processing, it checks to make sure the changed subject is the subject held.
    if (changedSubject == this.numberSubject) {
      print("Bar chart: ")
      for (i <- 0 until this.numberSubject.getValue()) {
        print("*")
      }
      println()
    }
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
