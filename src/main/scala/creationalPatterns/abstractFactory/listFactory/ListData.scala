// ˅
package creationalPatterns.abstractFactory.listFactory

import creationalPatterns.abstractFactory.factory.Data

// ˄

class ListData(_name: String) extends Data(_name) {
  // ˅
  
  // ˄

  override def toHTML(): String = {
    // ˅
    val buffer = new StringBuffer()
    buffer.append(f"<li>$name<ul>\n")
    items.foreach(item => buffer.append(item.toHTML()))
    buffer.append("</ul></li>\n")
    buffer.toString()
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
