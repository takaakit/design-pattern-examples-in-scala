// ˅
package behavioralPatterns.interpreter

// ˄

// Node in the syntax tree.
abstract class Node {
  // ˅
  
  // ˄

  def parse(context: Context)

  def toString(): String

  // ˅
  
  // ˄
}

// ˅

// ˄
