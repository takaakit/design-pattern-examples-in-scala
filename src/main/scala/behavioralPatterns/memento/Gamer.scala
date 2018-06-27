// ˅
package behavioralPatterns.memento

import java.util.Random

// ˄

class Gamer(_money: Int) {
  // ˅
  
  // ˄

  // Dessert name table
  private val dessertsName: Array[String] = Array("Cake", "Candy", "Cookie")

  // Gamer's money
  var money: Int = _money

  // Acquired desserts 
  private var desserts: Seq[String] = Seq[String]()

  // Random number generator
  private val random: Random = new Random()

  private var dessert: String = ""

  // Get a dessert
  private def getDessert(): String = {
    // ˅
    var prefix = ""
    if (random.nextBoolean()) {
      prefix = "Delicious "
    }
    prefix + dessertsName.apply(random.nextInt(dessertsName.size))
    // ˄
  }

  // Get current status
  def createMemento(): Memento = {
    // ˅
    val memento = new Memento(money)
    val it = desserts.iterator
    while (it.hasNext) {
      val dessert = it.next().asInstanceOf[String]
      if (dessert.startsWith("Delicious ")) {         // Add a only delicious dessert
        memento.addDessert(dessert)
      }
    }
    memento
    // ˄
  }

  // Undo status
  def restoreMemento(memento: Memento) = {
    // ˅
    this.money = memento.money
    this.desserts = memento.desserts
    // ˄
  }

  // Play a game
  def play() = {
    // ˅
    val dice = random.nextInt(6) + 1    // Shake a dice

    // In case of 1...Gamer's money increases
    if (dice == 1) {
      money += 100
      println("Gamer's money increases.")
    }
    // In case of 2...Gamer's money halves
    else if (dice == 2) {
      money /= 2
      println("Gamer's money halves.")
    }
    // In case of 6...Gamer gets desserts
    else if (dice == 6) {
      // Get a dessert
      val acquiredDessert: String = getDessert
      println(f"Gamer gets desserts($acquiredDessert)")
      desserts = desserts :+ acquiredDessert
    }
    // Other...Nothing happens
    else {
      println("Nothing happens.")
    }
    // ˄
  }

  override def toString(): String = {
    // ˅
    f"[money = $money, desserts = ${desserts.mkString(", ")}]"
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
