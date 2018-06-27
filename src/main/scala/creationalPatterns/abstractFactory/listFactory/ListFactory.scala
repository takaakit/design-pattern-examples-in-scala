// ˅
package creationalPatterns.abstractFactory.listFactory

import creationalPatterns.abstractFactory.factory._

// ˄

class ListFactory extends Factory {
  // ˅
  
  // ˄

  override def createPage(title: String, author: String): Page = {
    // ˅
    new ListPage(title, author)
    // ˄
  }

  override def createLink(name: String, url: String): Link = {
    // ˅
    new ListLink(name, url)
    // ˄
  }

  override def createData(name: String): Data = {
    // ˅
    new ListData(name)
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
