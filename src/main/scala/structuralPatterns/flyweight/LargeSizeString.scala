// ˅
package structuralPatterns.flyweight

import scala.collection.mutable.Seq

// ˄

class LargeSizeString(string: String) {
  // ˅

  // ˄

  private var largeSizeChars: Seq[LargeSizeChar] = Seq[LargeSizeChar]()

  def display(): Unit = {
    // ˅
    largeSizeChars.indices.foreach(i => largeSizeChars(i).display())
    // ˄
  }

  // ˅
  string.toCharArray.foreach(it => largeSizeChars = largeSizeChars :+ LargeSizeCharFactory.getLargeSizeChar(it))
  // ˄
}

// ˅

// ˄
