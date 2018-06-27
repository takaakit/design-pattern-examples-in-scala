// ˅
package behavioralPatterns.observer

import java.util.Random

// ˄

// Generate a random number.
class RandomNumber extends Number {
  // ˅
  
  // ˄

  override var value: Int = 0

  private val random: Random = new Random()

  override def generate() = {
    // ˅
    for (i <- 0 to 19) {
      value = random.nextInt(50)
      notifyObservers()
    }
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
