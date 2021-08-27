// ˅
package creationalPatterns.abstractFactory.listFactory

import creationalPatterns.abstractFactory.factory.Link

// ˄

class ListLink(_name: String, _url: String) extends Link(_name, _url) {
  // ˅
  
  // ˄

  override def toHTML(): String = {
    // ˅
    "  <li><a href=\"" + url + "\">" + name + "</a></li>" + System.getProperty("line.separator")
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
