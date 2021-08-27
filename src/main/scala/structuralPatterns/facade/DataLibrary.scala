// ˅
package structuralPatterns.facade

import java.io.FileInputStream
import java.util.Properties

// ˄

object DataLibrary {
  // ˅
  
  // ˄

  // Read a data library file.
  def getProperties(dataLibraryName: String): Properties = {
    // ˅
    val prop = new Properties()
    prop.load(new FileInputStream(dataLibraryName))
    prop
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
