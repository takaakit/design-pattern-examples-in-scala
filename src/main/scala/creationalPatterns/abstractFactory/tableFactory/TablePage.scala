// ˅
package creationalPatterns.abstractFactory.tableFactory

import creationalPatterns.abstractFactory.factory.Page

// ˄

class TablePage(_title: String, _author: String) extends Page(_title, _author) {
  // ˅
  
  // ˄

  override def toHTML(): String = {
    // ˅
    val buffer = new StringBuffer()
    val lineSep = System.getProperty("line.separator")
    buffer.append(f"<html><head><title>$title</title></head><body>$lineSep")
    buffer.append(f"<h1>$title</h1>$lineSep")
    buffer.append("<table width=\"80%\" border=\"3\">" + lineSep)
    contents.foreach(content => buffer.append(f"<tr>${content.toHTML()}</tr>$lineSep"))
    buffer.append(f"</table>$lineSep")
    buffer.append(f"<hr><address>$author</address>$lineSep")
    buffer.append(f"</body></html>$lineSep")
    buffer.toString
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
