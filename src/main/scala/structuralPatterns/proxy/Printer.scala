// ˅
package structuralPatterns.proxy

// ˄

trait Printer {
  // ˅
  
  // ˄

  def getName(): String

  def changeName(name: String): Unit

  def output(content: String): Unit

  // ˅
  
  // ˄
}

// ˅

// ˄
