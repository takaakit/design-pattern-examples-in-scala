// ˅
package structuralPatterns.flyweight

import scala.collection.mutable.Seq

// ˄

class LargeSizeString(string: String) {
  // ˅

  // ˄

  private var largeSizeChars: Seq[LargeSizeChar] = Seq[LargeSizeChar]()

  def display() = {
    // ˅
    largeSizeChars.indices.foreach(i => largeSizeChars.apply(i).display())
    // ˄
  }

  // ˅
  string.toCharArray.foreach(it => largeSizeChars = largeSizeChars :+ LargeSizeCharFactory.getLargeSizeChar(it))
  // ˄
}

// ˅

// ˄
