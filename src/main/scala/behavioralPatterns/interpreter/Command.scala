// ˅
package behavioralPatterns.interpreter

// ˄

class Command extends Node {
  // ˅
  
  // ˄

  private var node: Node = null

  override def parse(context: Context): Unit = {
    // ˅
    var aNode: Node = null
    if (context.getToken() == "repeat") {
      aNode = new Repeat()
      aNode.parse(context)
    }
    else {
      aNode = new Action()
      aNode.parse(context)
    }
    this.node = aNode // Hold the parsed node
    // ˄
  }

  override def toString(): String = {
    // ˅
    node.toString
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
