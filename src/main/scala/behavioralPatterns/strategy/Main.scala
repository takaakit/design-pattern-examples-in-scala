package behavioralPatterns.strategy

import behavioralPatterns.strategy.GameResultType.Win
import behavioralPatterns.strategy.GameResultType.Loss
import behavioralPatterns.strategy.GameResultType.Draw

/*
A game of rock-scissors-paper. Two strategies are available:
* Random Strategy: showing a random hand signal.
* Mirror Strategy: showing a hand signal from the previous opponent's hand signal.
*/

object Main {
  def main(args: Array[String]): Unit = {
    val player1 = new Player("Emily", new RandomStrategy)
    val player2 = new Player("James", new MirrorStrategy)

    for (i <- 0 until 100) {
      val handOfPlayer1 = player1.showHandSignal()
      val handOfPlayer2 = player2.showHandSignal()

      var resultOfPlayer1: GameResultType = null
      var resultOfPlayer2: GameResultType = null
      if (handOfPlayer1.isStrongerThan(handOfPlayer2)) {
        System.out.println("Winner: " + player1)
        resultOfPlayer1 = Win
        resultOfPlayer2 = Loss
      }
      else if (handOfPlayer2.isStrongerThan(handOfPlayer1)) {
        System.out.println("Winner: " + player2)
        resultOfPlayer1 = Loss
        resultOfPlayer2 = Win
      }
      else {
        System.out.println("Draw...")
        resultOfPlayer1 = Draw
        resultOfPlayer2 = Draw
      }

      player1.notifyGameResult(resultOfPlayer1, handOfPlayer1, handOfPlayer2)
      player2.notifyGameResult(resultOfPlayer2, handOfPlayer2, handOfPlayer1)
    }
    System.out.println("RESULT:")
    System.out.println(player1)
    System.out.println(player2)
  }
}
