// ˅
package creationalPatterns.abstractFactory.factory

import java.io.{File, FileWriter}
import scala.collection.mutable.Seq

// ˄

abstract class Page(_title: String, _author: String) {
  // ˅
  
  // ˄

  protected val title: String = _title

  protected val author: String = _author

  protected var contents: Seq[Item] = Seq[Item]()

  def toHTML(): String

  def add(item: Item): Unit = {
    // ˅
    contents = contents :+ item
    // ˄
  }

  def output(): Unit = {
    // ˅
    val fileName = f"$title.html"
    val writer = new FileWriter(fileName)
    writer.write(this.toHTML())
    writer.close()
    println(f"$fileName has been created.")
    println(f"Output File: ${new File(new File(".").getAbsoluteFile.getParent, fileName).getPath}")
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
