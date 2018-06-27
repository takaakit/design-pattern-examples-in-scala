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

  override def execute() = {
    // ˅
    pastCommands.forEach(_.execute())
    // ˄
  }

  def add(cmd: Command) = {
    // ˅
    pastCommands.add(cmd)
    // ˄
  }

  // Delete the last command
  def undo() = {
    // ˅
    if (pastCommands.empty() == false) {
      pastCommands.pop()
    }
    // ˄
  }

  // Delete all past commands.
  def clear() = {
    // ˅
    pastCommands.clear()
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
