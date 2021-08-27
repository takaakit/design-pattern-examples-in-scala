// ˅
package creationalPatterns.factoryMethod.framework

// ˄

abstract class Factory {
  // ˅
  
  // ˄

  def create(owner: String): Product = {
    // ˅
    // Write pre-creation code here, if any.

    val product = createProduct(owner)

    // Write post-creation code here, if any.

    product
    // ˄
  }

  protected def createProduct(owner: String): Product

  // ˅
  
  // ˄
}

// ˅

// ˄
