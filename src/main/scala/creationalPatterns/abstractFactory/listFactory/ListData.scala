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
    buffer.append(f"<li>$name<ul>" + System.getProperty("line.separator"))
    items.foreach(item => buffer.append(item.toHTML()))
    buffer.append("</ul></li>" + System.getProperty("line.separator"))
    buffer.toString
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
