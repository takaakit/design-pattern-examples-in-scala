package behavioralPatterns.templateMethod

// Display the character and string repeatedly 5 times.

object Main {
  def main(args: Array[String]): Unit = {
    val display1 = new CharDisplay('H')                       // Create an instance of the CharDisplay
    val display2 = new StringDisplay("Hello world.")          // Create an instance of the StringDisplay
    val display3 = new StringDisplay("Nice to meet you.")     // Create an instance of the StringDisplay

    // Any instance can be called with the same method name
    display1.output()
    display2.output()
    display3.output()
  }
}
