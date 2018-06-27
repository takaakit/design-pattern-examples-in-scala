// ˅
package creationalPatterns.builder

// ˄

class PlainTextBuilder extends Builder {
  // ˅
  
  // ˄

  private var buffer: StringBuffer = new StringBuffer()

  // String to output
  def result(): String = {
    // ˅
    buffer.toString()
    // ˄
  }

  // Make a title of plain text
  override def createTitle(title: String) = {
    // ˅
    buffer.append("--------------------------------\n")     // Decoration line
    buffer.append(f"[$title]\n")                             // Title
    buffer.append("\n")                                     // Blank line
    // ˄
  }

  // Make a section of plain text
  override def createSection(section: String) = {
    // ˅
    buffer.append(f"* $section\n")                           // Section
    buffer.append("\n")                                     // Blank line
    // ˄
  }

  // Make items of plain text
  override def createItems(items: Array[String]) = {
    // ˅
    items.indices.foreach(i => buffer.append(f"  - ${items.apply(i)}\n"))  // Items
    buffer.append("\n")                                     // Blank line
    // ˄
  }

  override def close() = {
    // ˅
    buffer.append("--------------------------------\n")     // Decoration line
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
