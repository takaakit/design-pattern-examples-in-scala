// ˅
package behavioralPatterns.strategy

// ˄

// Mirror Strategy: showing a hand signal from the previous opponent's hand signal.
class MirrorStrategy() extends Strategy {
  // ˅
  
  // ˄

  private var preOpponentsHand: HandSignal = HandSignalConstant.getHand(HandSignalConstant.ROCK)

  override def showHandSignal(): HandSignal = {
    // ˅
    preOpponentsHand
    // ˄
  }

  override def notifyGameResult(result: GameResultType, ownHand: HandSignal, opponentsHand: HandSignal): Unit = {
    // ˅
    preOpponentsHand = opponentsHand
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
