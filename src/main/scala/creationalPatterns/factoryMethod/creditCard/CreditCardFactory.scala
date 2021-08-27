// ˅
package creationalPatterns.factoryMethod.creditCard

import creationalPatterns.factoryMethod.framework.Factory
import creationalPatterns.factoryMethod.framework.Product

// ˄

class CreditCardFactory extends Factory {
  // ˅
  
  // ˄

  override def createProduct(owner: String): Product = {
    // ˅
    new CreditCard(owner)
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
