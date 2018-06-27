// ˅
package behavioralPatterns.strategy

import java.util.Random

// ˄

// Calculate a hand from the previous hand stochastically.
class StrategyB(randomSeed: Int) extends Strategy {
  // ˅
  
  // ˄

  private val random: Random = new Random(randomSeed)

  private val history: Array[Array[Int]] = Array(Array(1, 1, 1), Array(1, 1, 1), Array(1, 1, 1))

  private var preHand: Hand = Hand.getHand(Hand.ROCK)

  private var curHand: Hand = Hand.getHand(Hand.ROCK)

  override def nextHand(): Hand = {
    // ˅
    val randomHandValue = random.nextInt(getHistorySum(curHand.value))
    var handValue = 0
    if (randomHandValue < history.apply(curHand.value).apply(0)) {
      handValue = Hand.ROCK
    }
    else if (randomHandValue < history.apply(curHand.value).apply(0) + history.apply(curHand.value).apply(1)) {
      handValue = Hand.SCISSORS
    }
    else {
      handValue = Hand.PAPER
    }
    preHand = curHand
    curHand = Hand.getHand(handValue)
    curHand
    // ˄
  }

  override def learn(win: Boolean) = {
    // ˅
    if (win) {
      history.apply(preHand.value).apply(curHand.value) += 1
    }
    else {
      history.apply(preHand.value).apply((curHand.value + 1) % 3) += 1
      history.apply(preHand.value).apply((curHand.value + 2) % 3) += 1
    }
    // ˄
  }

  private def getHistorySum(handValue: Int): Int = {
    // ˅
    var sum = 0
    for (i <- 0 to 2) {
      sum += history.apply(handValue).apply(i)
    }
    sum
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
