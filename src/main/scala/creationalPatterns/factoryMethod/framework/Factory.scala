// ˅
package creationalPatterns.factoryMethod.framework

// ˄

abstract class Factory {
  // ˅
  
  // ˄

  def create(owner: String): Product = {
    // ˅
    val product = createProduct(owner)
    registerProduct(product)
    product
    // ˄
  }

  protected def createProduct(owner: String): Product

  protected def registerProduct(product: Product)

  // ˅
  
  // ˄
}

// ˅

// ˄
