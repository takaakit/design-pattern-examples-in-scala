// ˅
package behavioralPatterns.observer

// ˄

// Display values with digits.
class DigitObserver extends Observer {
  // ˅
  
  // ˄

  override def update(number: Number) = {
    // ˅
    println(f"Digit    : ${number.value}")
    Thread.sleep(100)
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
