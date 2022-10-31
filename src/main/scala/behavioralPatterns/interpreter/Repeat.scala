// ˅
package behavioralPatterns.interpreter

// ˄

// A node corresponding to "repeat".
class Repeat extends Node {
  // ˅
  
  // ˄

  private var number: Int = 0

  private var commandList: Node = null

  override def parse(context: Context): Unit = {
    // ˅
    context.slideToken("repeat")
    number = context.getNumber()
    context.slideToken(Integer.toString(number))
    val aCommandList = new CommandList()
    aCommandList.parse(context)
    this.commandList = aCommandList // Hold the parsed command list
    // ˄
  }

  override def toString(): String = {
    // ˅
    f"repeat $number $commandList"
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
