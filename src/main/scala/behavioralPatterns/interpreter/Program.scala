// ˅
package behavioralPatterns.interpreter

// ˄

// A node corresponding to "program".
class Program extends Node {
  // ˅
  
  // ˄

  private var commandList: Node = null

  override def parse(context: Context) = {
    // ˅
    context.slideToken("program")
    commandList = new CommandList()
    commandList.parse(context)
    // ˄
  }

  override def toString(): String = {
    // ˅
    f"[program ${commandList.toString}]"
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
