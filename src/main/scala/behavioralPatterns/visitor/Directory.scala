// ˅
package behavioralPatterns.visitor

import scala.collection.mutable.Seq

// ˄

class Directory(_name: String) extends FileSystemElement {
  // ˅
  
  // ˄

  private val name: String = _name

  // Collection of elements
  private var elements: Seq[FileSystemElement] = Seq[FileSystemElement]()

  // Directory name
  override def getName(): String = {
    // ˅
    name
    // ˄
  }

  // Directory size
  override def getSize(): Int = {
    // ˅
    var size = 0
    elements.foreach(element => size += element.getSize())
    size
    // ˄
  }

  // Accept a visitor
  override def accept(visitor: Visitor): Unit = {
    // ˅
    visitor.visit(this)
    // ˄
  }

  // Add an element
  def add(element: FileSystemElement): Unit = {
    // ˅
    elements = elements :+ element
    // ˄
  }

  // Get the iterator
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
