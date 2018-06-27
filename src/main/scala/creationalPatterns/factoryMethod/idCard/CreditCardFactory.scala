// ˅
package creationalPatterns.factoryMethod.idCard

import creationalPatterns.factoryMethod.framework.Factory
import creationalPatterns.factoryMethod.framework.Product

// ˄

class CreditCardFactory extends Factory {
  // ˅
  
  // ˄

  private val cardOwners: Seq[String] = Seq[String]()

  override def createProduct(owner: String): Product = {
    // ˅
    new CreditCard(owner)
    // ˄
  }

  override def registerProduct(product: Product) = {
    // ˅
    cardOwners :+ product.asInstanceOf[CreditCard].owner
    // ˄
  }

  def getCardOwner(): Seq[String] = {
    // ˅
    cardOwners
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
