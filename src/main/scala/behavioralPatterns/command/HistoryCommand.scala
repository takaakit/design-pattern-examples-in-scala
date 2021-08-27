// ˅
package behavioralPatterns.command

import java.util.Stack

// ˄

// Holder of the past commands
class HistoryCommand extends Command {
  // ˅
  
  // ˄

  // A set of past commands
  private val pastCommands: Stack[Command] = new Stack[Command]

  override def execute(): Unit = {
    // ˅
    pastCommands.forEach(_.execute())
    // ˄
  }

  def add(cmd: Command): Unit = {
    // ˅
    pastCommands.add(cmd)
    // ˄
  }

  // Delete the last command
  def undo(): Unit = {
    // ˅
    if (!pastCommands.empty()) {
      pastCommands.pop()
    }
    // ˄
  }

  // Delete all past commands.
  def clear(): Unit = {
    // ˅
    pastCommands.clear()
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
