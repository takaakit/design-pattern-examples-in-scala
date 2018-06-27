// ˅
package behavioralPatterns.visitor

// ˄

class ListVisitor extends Visitor {
  // ˅
  
  // ˄

  // Currently visited directory
  private var currentDirectory: String = ""

  // Visit a file
  override def visit(file: File) = {
    // ˅
    println(f"$currentDirectory/$file")
    // ˄
  }

  // Visit a directory
  override def visit(directory: Directory) = {
    // ˅
    println(f"$currentDirectory/$directory")
    val visitedDirectory = currentDirectory
    currentDirectory = currentDirectory + "/" + directory.name
    val it = directory.iterator()
    while (it.hasNext) {
      val element = it.next().asInstanceOf[FileSystemElement]
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
