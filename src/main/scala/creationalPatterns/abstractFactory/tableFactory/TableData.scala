// ˅
package creationalPatterns.abstractFactory.tableFactory

import creationalPatterns.abstractFactory.factory.Data

// ˄

class TableData(_name: String) extends Data(_name) {
  // ˅
  
  // ˄

  override def toHTML(): String = {
    // ˅
    val buffer = new StringBuffer()
    buffer.append("<td><table width=\"100%\" border=\"2\">\n")
    buffer.append("<tr><td bgcolor=\"#00CC00\" align=\"center\" colspan=\"" + items.size + "\"><b>" + name + "</b></td></tr>\n")
    buffer.append("<tr>\n")
    items.foreach(item => buffer.append(item.toHTML()))
    buffer.append("</tr>\n")
    buffer.append("</table></td>\n")
    buffer.toString()
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
