// ˅
package behavioralPatterns.visitor

// ˄

class ListVisitor extends Visitor {
  // ˅
  
  // ˄

  // Currently visited directory
  private var currentDirectory: String = ""

  // Visit a file
  override def visit(file: File): Unit = {
    // ˅
    println(f"$currentDirectory/$file")
    // ˄
  }

  // Visit a directory
  override def visit(directory: Directory): Unit = {
    // ˅
    println(f"$currentDirectory/$directory")
    val visitedDirectory = currentDirectory
    currentDirectory = f"$currentDirectory/${directory.getName()}"
    val it = directory.iterator()
    while (it.hasNext) {
      val element = it.next()
      element.accept(this)
    }
    currentDirectory = visitedDirectory
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
