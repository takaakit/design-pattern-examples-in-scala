// ˅
package structuralPatterns.composite

import scala.collection.mutable.Seq

// ˄

class Directory(_name: String) extends FileSystemElement {
  // ˅
  
  // ˄

  private val name: String = _name

  private var elements: Seq[FileSystemElement] = Seq[FileSystemElement]()

  override def getName(): String = {
    // ˅
    name
    // ˄
  }

  override def getSize(): Int = {
    // ˅
    var size = 0
    elements.foreach(element => size += element.getSize())
    size
    // ˄
  }

  // Print this element with the "upperPath".
  override def print(upperPath: String): Unit = {
    // ˅
    println(upperPath + "/" + this)
    elements.foreach(element => element.print(f"$upperPath/$name"))
    // ˄
  }

  // Add an element
  def add(element: FileSystemElement): Unit = {
    // ˅
    elements = elements :+ element
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
