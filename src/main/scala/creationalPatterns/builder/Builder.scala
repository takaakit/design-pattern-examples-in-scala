// ˅
package creationalPatterns.builder

// ˄

abstract class Builder {
  // ˅
  
  // ˄

  def createTitle(title: String)

  def createSection(section: String)

  def createItems(items: Array[String])

  def close()

  // ˅
  
  // ˄
}

// ˅

// ˄
