// ˅
package creationalPatterns.abstractFactory.tableFactory

import creationalPatterns.abstractFactory.factory.Link

// ˄

class TableLink(_name: String, _url: String) extends Link(_name, _url) {
  // ˅
  
  // ˄

  override def toHTML(): String = {
    // ˅
    "  <td><a href=\"" + url + "\">" + name + "</a></td>\n"
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
