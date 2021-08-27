// ˅
package creationalPatterns.builder

// ˄

class PlainTextBuilder extends Builder {
  // ˅
  
  // ˄

  private val builder: StringBuffer = new StringBuffer()

  // String to output
  def result(): String = {
    // ˅
    builder.toString
    // ˄
  }

  // Make a title of plain text
  override def createTitle(title: String): Unit = {
    // ˅
    val lineSep = System.getProperty("line.separator")
    builder.append(f"--------------------------------$lineSep")     // Decoration line
    builder.append(f"[$title]$lineSep")                             // Title
    builder.append(lineSep)                                         // Blank line
    // ˄
  }

  // Make a section of plain text
  override def createSection(section: String): Unit = {
    // ˅
    val lineSep = System.getProperty("line.separator")
    builder.append(f"* $section$lineSep")                           // Section
    builder.append(lineSep)                                         // Blank line
    // ˄
  }

  // Make items of plain text
  override def createItems(items: Array[String]): Unit = {
    // ˅
    val lineSep = System.getProperty("line.separator")
    items.indices.foreach(i => builder.append(f"  - ${items.apply(i)}$lineSep"))     // Items
    builder.append(lineSep)                                         // Blank line
    // ˄
  }

  override def close(): Unit = {
    // ˅
    val lineSep = System.getProperty("line.separator")
    builder.append(f"--------------------------------$lineSep")     // Decoration line
    // ˄
  }

  def getContent(): String = {
    // ˅
    builder.toString
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
