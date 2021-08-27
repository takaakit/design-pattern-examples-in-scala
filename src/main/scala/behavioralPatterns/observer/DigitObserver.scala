// ˅
package behavioralPatterns.observer

// ˄

// Display values with digits.
class DigitObserver(_numberSubject: NumberSubject) extends Observer {
  // ˅
  
  // ˄

  private val numberSubject: NumberSubject = _numberSubject

  override def update(changedSubject: Subject): Unit = {
    // ˅
    if (changedSubject == this.numberSubject) {
      println(f"Digit    : ${this.numberSubject.getValue()}")
    }
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
