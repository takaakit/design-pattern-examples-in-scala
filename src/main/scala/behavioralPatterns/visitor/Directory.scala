// ˅
package behavioralPatterns.visitor

import scala.collection.mutable.Seq

// ˄

class Directory(_name: String) extends FileSystemElement {
  // ˅
  
  // ˄

  // Directory name
  override val name: String = _name

  // Collection of elements
  private var elements: Seq[FileSystemElement] = Seq[FileSystemElement]()

  override def size(): Int = {
    // ˅
    var size = 0
    elements.foreach(element => size += element.size)
    size
    // ˄
  }

  // Accept a visitor
  override def accept(visitor: Visitor) = {
    // ˅
    visitor.visit(this)
    // ˄
  }

  // Add an entry
  def add(element: FileSystemElement): FileSystemElement = {
    // ˅
    elements = elements :+ element
    this
    // ˄
  }

  // Create a iterator
  def iterator(): Iterator[FileSystemElement] = {
    // ˅
    elements.iterator
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
