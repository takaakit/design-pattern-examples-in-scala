package creationalPatterns.factoryMethod

import creationalPatterns.factoryMethod.idCard.CreditCardFactory

// Factory to make ID cards.

object Main {
  def main(args: Array[String]): Unit = {
    val factory = new CreditCardFactory()

    val jacksonCard = factory.create("Jackson")
    jacksonCard.use()

    val sophiaCard = factory.create("Sophia")
    sophiaCard.use()

    val oliviaCard = factory.create("Olivia")
    oliviaCard.use()
  }
}
