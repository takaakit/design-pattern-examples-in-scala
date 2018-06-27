// ˅
package creationalPatterns.abstractFactory.factory

import java.io.FileWriter
import scala.collection.mutable.Seq

// ˄

abstract class Page(_title: String, _author: String) {
  // ˅
  
  // ˄

  protected val title: String = _title

  protected val author: String = _author

  protected var contents: Seq[Item] = Seq[Item]()

  def toHTML(): String

  def add(item: Item) = {
    // ˅
    contents = contents :+ item
    // ˄
  }

  def output() = {
    // ˅
    val fileName = f"$title.html"
    val writer = new FileWriter(fileName)
    writer.write(this.toHTML())
    writer.close()
    println(f"$fileName has been created.")
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
