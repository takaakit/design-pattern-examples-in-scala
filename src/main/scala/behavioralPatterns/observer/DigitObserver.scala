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
    // Before processing, it checks to make sure the changed subject is the subject held.
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
