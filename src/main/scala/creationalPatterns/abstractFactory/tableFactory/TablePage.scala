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
    buffer.append(f"<html><head><title>$title</title></head><body>\n")
    buffer.append(f"<h1>$title</h1>\n")
    buffer.append("<table width=\"80%\" border=\"3\">\n")
    contents.foreach(content => buffer.append(f"<tr>${content.toHTML()}</tr>\n"))
    buffer.append("</table>\n")
    buffer.append(f"<hr><address>$author</address>\n")
    buffer.append("</body></html>\n")
    buffer.toString()
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
