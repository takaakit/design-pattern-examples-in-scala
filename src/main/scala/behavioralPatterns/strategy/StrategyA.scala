// ˅
package behavioralPatterns.strategy

import java.util.Random

// ˄

// When winning a game, show the same hand at the next time.
class StrategyA(randomSeed: Int) extends Strategy {
  // ˅
  
  // ˄

  private val random: Random = new Random(randomSeed)

  private var won: Boolean = false

  private var preHand: Hand = Hand.getHand(Hand.ROCK)

  override def nextHand(): Hand = {
    // ˅
    if (!won) {
      preHand = Hand.getHand(random.nextInt(3))
    }
    preHand
    // ˄
  }

  override def learn(win: Boolean) = {
    // ˅
    won = win
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
