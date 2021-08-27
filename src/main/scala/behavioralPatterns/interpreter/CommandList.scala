// ˅
package behavioralPatterns.interpreter

import scala.collection.mutable.Seq
import scala.util.control.Breaks

// ˄

class CommandList extends Node {
  // ˅
  
  // ˄

  private var nodes: Seq[Node] = Seq[Node]()

  override def parse(context: Context): Unit = {
    // ˅
    val b = new Breaks
    b.breakable {
      while (true) {
        if (context.getToken().isEmpty) {
          throw new Exception("Missing 'end'")
        }
        else if (context.getToken() == "end") {
          context.slideToken("end")
          b.break
        }
        else {
          val aNode = new Command()
          aNode.parse(context)
          nodes = nodes :+ aNode  // Hold the parsed node
        }
      }
    }
    // ˄
  }

  override def toString(): String = {
    // ˅
    "[" + nodes.mkString(", ") + "]"
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
