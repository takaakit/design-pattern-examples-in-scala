// ˅
package behavioralPatterns.strategy

// ˄

// Show a hand signal.
trait Strategy {
  // ˅
  
  // ˄

  def showHandSignal(): HandSignal

  // Notify a game result.
  def notifyGameResult(result: GameResultType, ownHand: HandSignal, opponentsHand: HandSignal): Unit

  // ˅
  
  // ˄
}

// ˅

// ˄
