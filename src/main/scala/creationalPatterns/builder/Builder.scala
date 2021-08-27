// ˅
package creationalPatterns.builder

// ˄

trait Builder {
  // ˅
  
  // ˄

  def createTitle(title: String): Unit

  def createSection(section: String): Unit

  def createItems(items: Array[String]): Unit

  def close(): Unit

  // ˅
  
  // ˄
}

// ˅

// ˄
