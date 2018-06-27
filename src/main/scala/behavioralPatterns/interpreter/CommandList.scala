// ˅
package behavioralPatterns.interpreter

import scala.util.control.Breaks
import scala.collection.mutable.Seq

// ˄

class CommandList extends Node {
  // ˅
  
  // ˄

  private var nodes: Seq[Node] = Seq[Node]()

  override def parse(context: Context) = {
    // ˅
    val b = new Breaks
    b.breakable {
      while (true) {
        if (context.getToken() == null) {
          throw new Exception("Missing 'end'")
        }
        else if (context.getToken() == "end") {
          context.slideToken("end")
          b.break
        }
        else {
          val commandNode = new Command()
          commandNode.parse(context)
          nodes = nodes :+ commandNode
        }
      }
    }
    // ˄
  }

  override def toString(): String = {
    // ˅
    nodes.mkString(" ")
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
