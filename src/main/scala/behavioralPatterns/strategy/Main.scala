package behavioralPatterns.strategy

/*
A game of rock-scissors-paper.
There are two strategies below.

* When winning a game, show the same hand at the next time.
* Calculate a hand from the previous hand stochastically.
*/

object Main {
  def main(args: Array[String]): Unit = {
    if (args.size != 2) {
      println("Usage: java Main RandomSeedNumber1 RandomSeedNumber2")
      println("Ex.  : java Main 314 15")
    }
    else {
      val randomSeed1 = Integer.parseInt(args.apply(0).asInstanceOf[String])
      val randomSeed2 = Integer.parseInt(args.apply(1).asInstanceOf[String])
      val player1 = new Player("Emily", new StrategyA(randomSeed1))
      val player2 = new Player("James", new StrategyB(randomSeed2))

      for (i <- 0 to 99) {
        val nextHand1 = player1.nextHand()
        val nextHand2 = player2.nextHand()
        if (nextHand1.isStrongerThan(nextHand2)) {
          println(f"Winner: $player1")
          player1.won()
          player2.lost()
        }
        else if (nextHand2.isStrongerThan(nextHand1)) {
          println(f"Winner: $player2")
          player1.lost()
          player2.won()
        }
        else {
          println("Draw...")
          player1.drew()
          player2.drew()
        }
      }
      println("RESULT:")
      println(player1.toString())
      println(player2.toString())
    }
  }
}
