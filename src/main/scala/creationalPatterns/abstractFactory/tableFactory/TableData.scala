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
    val lineSep = System.getProperty("line.separator")
    buffer.append("<td><table width=\"100%\" border=\"2\">" + lineSep)
    buffer.append("<tr><td bgcolor=\"#00CC00\" align=\"center\" colspan=\"" + items.size + "\"><b>" + name + "</b></td></tr>" + lineSep)
    buffer.append(f"<tr>$lineSep")
    items.foreach(item => buffer.append(item.toHTML()))
    buffer.append(f"</tr>$lineSep")
    buffer.append(f"</table></td>$lineSep")
    buffer.toString
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
