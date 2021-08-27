// ˅
package behavioralPatterns.interpreter

// ˄

// Node in the syntax tree.
abstract class Node {
  // ˅
  
  // ˄

  def parse(context: Context): Unit

  def toString(): String

  // ˅
  
  // ˄
}

// ˅

// ˄
