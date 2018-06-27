package structuralPatterns.decorator

// Display a character string with a decorative frame.

object Main {
  def main(args: Array[String]): Unit = {
    val displayA: Display = new MessageDisplay("Nice to meet you.")
    displayA.show()

    val displayB: Display = new SideFrame(displayA, '!')
    displayB.show()

    val displayC: Display = new FullFrame(displayB)
    displayC.show()

    val displayD: Display = new SideFrame(
      new FullFrame(
        new FullFrame(
          new SideFrame(
            new SideFrame(
              new FullFrame(
                new MessageDisplay("See you again.")
              ),
              '#'
            ),
            '#'
          )
        )
      ),
      '#'
    )
    displayD.show()
  }
}
