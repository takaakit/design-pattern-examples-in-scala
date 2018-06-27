// ˅
package creationalPatterns.abstractFactory.tableFactory

import creationalPatterns.abstractFactory.factory._

// ˄

class TableFactory extends Factory {
  // ˅
  
  // ˄

  override def createPage(title: String, author: String): Page = {
    // ˅
    new TablePage(title, author)
    // ˄
  }

  override def createLink(name: String, url: String): Link = {
    // ˅
    new TableLink(name, url)
    // ˄
  }

  override def createData(name: String): Data = {
    // ˅
    new TableData(name)
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
