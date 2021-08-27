// ˅
package creationalPatterns.builder

import java.io.PrintWriter
import java.io.FileWriter

// ˄

class HTMLBuilder extends Builder {
  // ˅
  
  // ˄

  // File name to create
  private var fileName: String = ""

  private var writer: PrintWriter = null

  // Make a title of HTML file
  override def createTitle(title: String): Unit = {
    // ˅
    fileName = f"$title.html"                     // Set a title as a file name
    writer = new PrintWriter(new FileWriter(fileName))
    writer.println(f"<html><head><title>$title</title></head><body>")  // Write a title
    writer.println(f"<h1>$title</h1>")
    // ˄
  }

  // Make a section of HTML file
  override def createSection(section: String): Unit = {
    // ˅
    writer.println(f"<p>$section</p>")        // Write a section
    // ˄
  }

  // Make items of HTML file
  override def createItems(items: Array[String]): Unit = {
    // ˅
    writer.println("<ul>")                  // Write items
    items.indices.foreach(i => writer.println("<li>" + items.apply(i) + "</li>"))
    writer.println("</ul>")
    // ˄
  }

  override def close(): Unit = {
    // ˅
    writer.println("</body></html>")
    writer.close()                         // Close file
    // ˄
  }

  def getFileName(): String = {
    // ˅
    fileName
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
