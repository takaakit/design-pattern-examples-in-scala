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
    val lineSep = System.getProperty("line.separator")
    buffer.append(f"<html><head><title>$title</title></head>$lineSep")
    buffer.append(f"<body><h1>$title</h1>$lineSep")
    buffer.append(f"<ul>$lineSep")
    contents.foreach(content => buffer.append(content.toHTML()))
    buffer.append(f"</ul>$lineSep")
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
