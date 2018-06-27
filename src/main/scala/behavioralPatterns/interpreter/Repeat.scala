// ˅
package behavioralPatterns.interpreter

// ˄

// A node corresponding to "repeat".
class Repeat extends Node {
  // ˅
  
  // ˄

  private var number: Int = 0

  private var commandList: Node = null

  override def parse(context: Context) = {
    // ˅
    context.slideToken("repeat")
    number = context.getNumber()
    context.nextToken()
    commandList = new CommandList()
    commandList.parse(context)
    // ˄
  }

  override def toString(): String = {
    // ˅
    f"[repeat $number $commandList]"
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
