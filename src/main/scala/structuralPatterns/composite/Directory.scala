// ˅
package structuralPatterns.composite

import scala.collection.mutable.Seq

// ˄

class Directory(_name: String) extends FileSystemElement {
  // ˅
  
  // ˄

  override protected val name: String = _name

  override protected val size: Int = 0

  private var elements: Seq[FileSystemElement] = Seq[FileSystemElement]()

  // Print this element with the "upperPath".
  override def print(upperPath: String) = {
    // ˅
    println(upperPath + "/" + this)
    elements.foreach(element => element.print(f"$upperPath/$name"))
    // ˄
  }

  // Add a element
  def add(element: FileSystemElement): FileSystemElement = {
    // ˅
    elements = elements :+ element
    this
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
