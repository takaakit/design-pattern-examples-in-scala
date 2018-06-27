package structuralPatterns.adapter

/*
Display a character string as follows
  -- Nice to meet you --
or display it as follows.
  [[ Nice to meet you ]]
*/

object Main {
  def main(args: Array[String]): Unit = {
    val p: Print = new PrintMessageDisplay("Nice to meet you")
    p.printWeak()
    p.printStrong()
  }
}
