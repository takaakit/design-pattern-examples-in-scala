// ˅
package behavioralPatterns.strategy

// ˄

object HandSignalConstant {
  // ˅
  
  // ˄

  // Rock
  val ROCK: Int = 0

  // Scissors
  val SCISSORS: Int = 1

  // Paper
  val PAPER: Int = 2

  // Hands of rock-scissors-paper
  private val handSignals: Array[HandSignal] = Array(new HandSignal(ROCK), new HandSignal(SCISSORS), new HandSignal(PAPER))

  // Characters of the hands
  val name: Array[String] = Array("Rock", "Scissors", "Paper")

  // Get an instance of the hand
  def getHand(handValue: Int): HandSignal = {
    // ˅
    handSignals.apply(handValue)
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
