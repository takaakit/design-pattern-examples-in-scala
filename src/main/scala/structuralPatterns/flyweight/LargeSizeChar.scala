// ˅
package structuralPatterns.flyweight

import java.io.BufferedReader
import java.io.FileReader
import java.io.IOException

// ˄

class LargeSizeChar(_charName: Char) {
  // ˅
  
  // ˄

  private val charName: Char = _charName

  // Display data of the large size character
  private var displayData: String = null

  // Display the large size character
  def display() = {
    // ˅
    print(displayData)
    // ˄
  }

  // ˅
  try {
    val reader = new BufferedReader(new FileReader(f"src/main/scala/structuralPatterns/Flyweight/big$charName.txt"))
    var line: String = reader.readLine()
    val buf = new StringBuffer()
    while (line != null) {
      buf.append(line)
      buf.append("\n")
      line = reader.readLine()
    }
    reader.close()
    displayData = buf.toString()
  }
  catch {
    case e: IOException => displayData = charName + "?"
  }
  // ˄
}

// ˅

// ˄
