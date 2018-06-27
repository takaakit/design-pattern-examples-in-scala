// ˅
package creationalPatterns.factoryMethod.idCard

import creationalPatterns.factoryMethod.framework._

// ˄

class CreditCard(_owner: String) extends Product {
  // ˅
  println(f"Make $owner's card.")
  // ˄

  val owner: String = _owner

  override def use() = {
    // ˅
    println(f"Use $owner's card.")
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
