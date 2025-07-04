package creationalPatterns.factoryMethod

import creationalPatterns.factoryMethod.creditCard.CreditCardFactory

/*
The subject is a factory to make credit cards. The Factory defines how to create a credit card,
but the actual credit card is created by the CreditCardFactory.
The "createProduct()" is called a Factory Method, and it is responsible for manufacturing an object.
 */

@main
def main(): Unit = {
  val factory = new CreditCardFactory()

  val jacksonCard = factory.create("Jackson")
  jacksonCard.use()

  val sophiaCard = factory.create("Sophia")
  sophiaCard.use()

  val oliviaCard = factory.create("Olivia")
  oliviaCard.use()
}
