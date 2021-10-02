// ˅
package structuralPatterns.flyweight

import scala.collection.mutable.Map

// ˄

object LargeSizeCharFactory {
  // ˅
  
  // ˄

  private val poolChars: Map[Char, LargeSizeChar] = Map[Char, LargeSizeChar]()

  // Create an instance of the large size character.
  def getLargeSizeChar(charName: Char): LargeSizeChar = {
    // ˅
    var lsc: LargeSizeChar = null
    if (poolChars.contains(charName)) {
      lsc = poolChars.apply(charName)
    }
    else {
      lsc = new LargeSizeChar(charName)            // Create an instance
      poolChars.put(charName, lsc)
    }
    lsc
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
