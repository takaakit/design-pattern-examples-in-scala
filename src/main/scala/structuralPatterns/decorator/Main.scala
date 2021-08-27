package structuralPatterns.decorator

/*
Display a string with decorative frames. The frames can be combined arbitrarily.
*/

object Main {
  def main(args: Array[String]): Unit = {
    val displayA = new MessageDisplay("Nice to meet you.")
    displayA.show()

    val displayB = new SideFrame(new MessageDisplay("Nice to meet you."), '!')
    displayB.show()

    val displayC = new FullFrame(new SideFrame(new MessageDisplay("Nice to meet you."), '!'))
    displayC.show()
  }
}
