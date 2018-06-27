// ˅
package behavioralPatterns.observer

// ˄

// Display values with a bar chart.
class BarChartObserver extends Observer {
  // ˅
  
  // ˄

  override def update(number: Number) = {
    // ˅
    print("Bar chart: ")
    for (i <- 0 until number.value) {
      print("*")
    }
    println("")
    Thread.sleep(100)
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
