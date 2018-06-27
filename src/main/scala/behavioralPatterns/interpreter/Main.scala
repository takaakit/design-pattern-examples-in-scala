package behavioralPatterns.interpreter

import scala.io.Source

/*
Analyze the syntax of the mini-language composed of "forward", "left", "right", and "repeat" commands.

-----
Examples before and after syntax analysis.
* Ex.1
Before : "program end"
After  : [program []]

* Ex.2
Before : "program forward right left end"
After  : [program [forward, right, left]]

* Ex.3
Before : "program repeat 4 forward right end end"
After  : [program [[repeat 4 [forward, right]]]]
*/

object Main {
  def main(args: Array[String]): Unit = {
    val source = Source.fromFile("src/main/scala/behavioralPatterns/interpreter/program.txt")
    source.getLines.foreach { line =>
      println("TEXT > \"" + line + "\"")
      val node = new Program()
      node.parse(new Context(line))
      println("NODE > " + node)
    }
    source.close()
  }
}
