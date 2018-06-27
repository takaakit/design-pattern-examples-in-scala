// ˅
package creationalPatterns.abstractFactory.listFactory

import creationalPatterns.abstractFactory.factory.Page

// ˄

class ListPage(_title: String, _author: String) extends Page(_title, _author) {
  // ˅
  
  // ˄

  override def toHTML(): String = {
    // ˅
    val buffer = new StringBuffer()
    buffer.append(f"<html><head><title>$title</title></head>\n")
    buffer.append(f"<body><h1>$title</h1>\n")
    buffer.append("<ul>\n")
    contents.foreach(content => buffer.append(content.toHTML()))
    buffer.append("</ul>\n")
    buffer.append(f"<hr><address>$author</address>")
    buffer.append("</body></html>\n")
    buffer.toString()
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
