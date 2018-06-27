// ˅
package structuralPatterns.facade

import java.io.FileWriter

// ˄

object PageCreator {
  // ˅
  
  // ˄

  def createSimpleHomepage(mailAddress: String, htmlFileName: String) = {
    // ˅
    val addressBook = DataLibrary.getProperties("src/main/scala/structuralPatterns/facade/addressbook")
    val userName = addressBook.getProperty(mailAddress)
    val writer = new HtmlWriter(new FileWriter(htmlFileName))
    writer.heading(f"$userName's homepage")
    writer.paragraph(f"Welcome to $userName's homepage.")
    writer.paragraph("Please email me at this address.")
    writer.mailto(mailAddress, userName)
    writer.close()
    println(f"$htmlFileName is created for $mailAddress ($userName)")
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
