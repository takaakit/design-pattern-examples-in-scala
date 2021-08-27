// ˅
package creationalPatterns.factoryMethod.creditCard

import creationalPatterns.factoryMethod.framework._

// ˄

class CreditCard(_owner: String) extends Product {
  // ˅
  
  // ˄

  val owner: String = _owner

  override def use(): Unit = {
    // ˅
    println(f"Use $owner's card.")
    // ˄
  }

  // ˅
  println(f"Make $owner's card.")
  // ˄
}

// ˅

// ˄
