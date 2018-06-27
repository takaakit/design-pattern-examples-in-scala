// ˅
package creationalPatterns.abstractFactory.factory

import scala.collection.mutable.Seq

// ˄

abstract class Data(_name: String) extends Item(_name) {
  // ˅
  
  // ˄

  protected var items: Seq[Item] = Seq[Item]()

  def add(item: Item) = {
    // ˅
    items = items :+ item
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
