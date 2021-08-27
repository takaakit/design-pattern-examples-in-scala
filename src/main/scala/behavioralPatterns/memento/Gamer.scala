// ˅
package behavioralPatterns.memento

import java.util.Random

// ˄

class Gamer(_money: Int) {
  // ˅
  
  // ˄

  // Gamer's money
  var money: Int = _money

  // Random number generator
  private val random: Random = new Random()

  def createMemento(): Memento = {
    // ˅
    new Memento(money)
    // ˄
  }

  def setMemento(memento: Memento): Unit = {
    // ˅
    this.money = memento.money
    // ˄
  }

  // Play a game
  def play(): Unit = {
    // ˅
    val dice = random.nextInt(6) + 1    // Shake a dice
    println(f"The number of dice is $dice.")

    val preMoney = money

    dice match {
      case 1 | 3 | 5 =>
        // In case of odd...Money is halved
        money /= 2
        println(f"Gamer's money is halved: $preMoney -> $money")
      case 2 | 4 | 6 =>
        // In case of even...Money doubles
        money *= 2
        println(f"Gamer's money doubles: $preMoney -> $money")
      case _ =>
        // Other...Exit
        System.err.println("Unexpected value.")
        System.exit(-1)
    }
    // ˄
  }

  override def toString(): String = {
    // ˅
    f"[money = $money]"
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
