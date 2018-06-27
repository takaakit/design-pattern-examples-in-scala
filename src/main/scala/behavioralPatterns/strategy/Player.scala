// ˅
package behavioralPatterns.strategy

// ˄

class Player(_name: String, _strategy: Strategy) {
  // ˅
  
  // ˄

  private val name: String = _name

  private var winCount: Int = 0

  private var lossCount: Int = 0

  private var gameCount: Int = 0

  private val strategy: Strategy = _strategy

  // Calculate a hand from the strategy.
  def nextHand(): Hand = {
    // ˅
    strategy.nextHand()
    // ˄
  }

  // Won a game.
  def won() = {
    // ˅
    strategy.learn(true)
    winCount += 1
    gameCount += 1
    // ˄
  }

  // Lost a game.
  def lost() = {
    // ˅
    strategy.learn(false)
    lossCount += 1
    gameCount += 1
    // ˄
  }

  // Drew a game.
  def drew() = {
    // ˅
    gameCount += 1
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
