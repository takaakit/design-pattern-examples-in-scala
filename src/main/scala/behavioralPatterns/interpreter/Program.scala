// ˅
package behavioralPatterns.interpreter

// ˄

// A node corresponding to "program".
class Program extends Node {
  // ˅
  
  // ˄

  private var commandList: Node = null

  override def parse(context: Context): Unit = {
    // ˅
    context.slideToken("program")
    val aCommandList = new CommandList()
    aCommandList.parse(context)
    this.commandList = aCommandList // Hold the parsed command list
    // ˄
  }

  override def toString(): String = {
    // ˅
    f"[program $commandList]"
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
