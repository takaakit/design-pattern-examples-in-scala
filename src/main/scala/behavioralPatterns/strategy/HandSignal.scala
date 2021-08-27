// ˅
package behavioralPatterns.strategy

// ˄

class HandSignal(_value: Int) {
  // ˅
  
  // ˄

  // Values of rock, scissors and paper.
  val value: Int = _value

  // Return true if "this" is stronger than "hand".
  def isStrongerThan(hand: HandSignal): Boolean = {
    // ˅
    judgeGame(hand) == 1
    // ˄
  }

  // Return false if "this" is weaker than "hand".
  def isWeakerThan(hand: HandSignal): Boolean = {
    // ˅
    judgeGame(hand) == -1
    // ˄
  }

  override def toString(): String = {
    // ˅
    HandSignalConstant.name.apply(value)
    // ˄
  }

  // The draw is 0. "this" win is 1. "hand" win is -1.
  private def judgeGame(hand: HandSignal): Int = {
    // ˅
    if (this == hand) {
      0
    }
    else if ((this.value + 1) % 3 == hand.value) {
      1
    }
    else {
      -1
    }
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
