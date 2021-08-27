// ˅
package behavioralPatterns.strategy

import java.util.Random

// ˄

// Random Strategy: showing a random hand signal.
class RandomStrategy() extends Strategy {
  // ˅
  
  // ˄

  private val random: Random = new Random

  override def showHandSignal(): HandSignal = {
    // ˅
    HandSignalConstant.getHand(random.nextInt(3))
    // ˄
  }

  override def notifyGameResult(result: GameResultType, ownHand: HandSignal, opponentsHand: HandSignal): Unit = {
    // ˅
    // Do nothing
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
