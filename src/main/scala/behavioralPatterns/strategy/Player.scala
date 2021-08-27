// ˅
package behavioralPatterns.strategy

import behavioralPatterns.strategy.GameResultType.Win
import behavioralPatterns.strategy.GameResultType.Loss
import behavioralPatterns.strategy.GameResultType.Draw

// ˄

class Player(_name: String, _strategy: Strategy) {
  // ˅
  
  // ˄

  private val name: String = _name

  private var winCount: Int = 0

  private var lossCount: Int = 0

  private var gameCount: Int = 0

  private val strategy: Strategy = _strategy

  // Show a hand signal from the strategy.
  def showHandSignal(): HandSignal = {
    // ˅
    strategy.showHandSignal()
    // ˄
  }

  // Notify a game result.
  def notifyGameResult(result: GameResultType, ownHand: HandSignal, opponentsHand: HandSignal): Unit = {
    // ˅
    result match {
      case Win =>
        winCount += 1
        gameCount += 1
      case Loss =>
        lossCount += 1
        gameCount += 1
      case Draw =>
        gameCount += 1
    }
    strategy.notifyGameResult(result, ownHand, opponentsHand)
    // ˄
  }

  override def toString(): String = {
    // ˅
    f"$name [$gameCount games, $winCount won, $lossCount lost, ${gameCount - winCount - lossCount} drew]"
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
