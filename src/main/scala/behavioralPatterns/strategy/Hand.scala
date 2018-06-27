// ˅
package behavioralPatterns.strategy

// ˄

class Hand(_value: Int) {
  // ˅

  // ˄

  // Values of rock, scissors and paper.
  val value: Int = _value

  // Return true if "this" is stronger than "hand".
  def isStrongerThan(hand: Hand): Boolean = {
    // ˅
    judgeGame(hand) == 1
    // ˄
  }

  // Return false if "this" is weaker than "hand".
  def isWeakerThan(hand: Hand): Boolean = {
    // ˅
    judgeGame(hand) == -1
    // ˄
  }

  override def toString(): String = {
    // ˅
    Hand.name.apply(value)
    // ˄
  }

  // The draw is 0. "this" win is 1. "hand" win is -1.
  private def judgeGame(hand: Hand): Int = {
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
object Hand {
  val ROCK: Int = 0 // Rock
  val SCISSORS: Int = 1 // Scissors
  val PAPER: Int = 2 // Paper

  // Hands of rock-scissors-paper
  private val hands = Array(new Hand(ROCK), new Hand(SCISSORS), new Hand(PAPER))

  // Characters of the hands
  private val name = Array("Rock", "Scissors", "Paper")

  // Get an instance of the hand
  def getHand(handValue: Int): Hand = {
    hands.apply(handValue)
  }
}
// ˄
