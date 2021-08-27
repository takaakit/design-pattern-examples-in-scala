// ˅
package structuralPatterns.flyweight

import scala.collection.mutable.Map

// ˄

object LargeSizeCharFactory {
  // ˅
  
  // ˄

  private val poolChars: Map[String, LargeSizeChar] = Map[String, LargeSizeChar]()

  // Create an instance of the large size character.
  def getLargeSizeChar(charName: Char): LargeSizeChar = {
    // ˅
    var lsc: LargeSizeChar = null
    if (poolChars.contains(charName.toString)) {
      lsc = poolChars.apply(charName.toString)
    }
    else {
      lsc = new LargeSizeChar(charName)            // Create an instance
      poolChars.put(charName.toString, lsc)
    }
    lsc
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
