// ˅
package behavioralPatterns.interpreter

// ˄

class Command extends Node {
  // ˅
  
  // ˄

  private var node: Node = null

  override def parse(context: Context) = {
    // ˅
    if (context.getToken() == "repeat") {
      node = new Repeat()
      node.parse(context)
    }
    else {
      node = new Action()
      node.parse(context)
    }
    // ˄
  }

  override def toString(): String = {
    // ˅
    node.toString()
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
