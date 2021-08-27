// ˅
package structuralPatterns.flyweight

import java.io.IOException
import scala.io.Source

// ˄

class LargeSizeChar(_charName: Char) {
  // ˅
  
  // ˄

  private val charName: Char = _charName

  // Display data of the large size character
  private var displayData: String = null

  // Display the large size character
  def display(): Unit = {
    // ˅
    print(displayData)
    // ˄
  }

  // ˅
  try {
    val source = Source.fromFile(f"src/main/scala/structuralPatterns/Flyweight/big$charName.txt")
    val buf = new StringBuffer()
    for (line <- source.getLines) {
      buf.append(line)
      buf.append(System.getProperty("line.separator"))
    }
    source.close
    displayData = buf.toString
  }
  catch {
    case e: IOException => displayData = charName + "?"
  }
  // ˄
}

// ˅

// ˄
