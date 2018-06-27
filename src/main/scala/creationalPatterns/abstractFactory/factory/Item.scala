// ˅
package creationalPatterns.abstractFactory.factory

// ˄

abstract class Item(_name: String) {
  // ˅
  
  // ˄

  protected val name: String = _name

  def toHTML(): String

  // ˅
  
  // ˄
}

// ˅

// ˄
