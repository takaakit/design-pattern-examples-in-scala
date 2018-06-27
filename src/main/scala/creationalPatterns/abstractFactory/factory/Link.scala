// ˅
package creationalPatterns.abstractFactory.factory

// ˄

abstract class Link(_name: String, _url: String) extends Item(_name) {
  // ˅
  
  // ˄

  protected val url: String = _url

  // ˅
  
  // ˄
}

// ˅

// ˄
