// ˅
package creationalPatterns.abstractFactory.factory

// ˄

abstract class Factory {
  // ˅
  
  // ˄

  def createPage(title: String, author: String): Page

  def createLink(name: String, url: String): Link

  def createData(name: String): Data

  // ˅
  
  // ˄
}

// ˅

// ˄
