package creationalPatterns.builder

import java.io.File
import java.util.Scanner

/*
Create documents in HTML format and text format. It is possible to create different documents
in the same construction process.
 */

object Main {
  def main(args: Array[String]): Unit = {
    println("Please enter \"plain\" or \"html\":")
    val scan = new Scanner(System.in)
    val inputValue = scan.next

    if (inputValue == "plain") {
      val plainTextBuilder = new PlainTextBuilder
      val director = new Director(plainTextBuilder)
      director.build()
      val content = plainTextBuilder.getContent()
      println(content)
    }
    else if (inputValue == "html") {
      val htmlBuilder = new HTMLBuilder
      val director = new Director(htmlBuilder)
      director.build()
      val fileName = htmlBuilder.getFileName()
      println(f"$fileName has been created.")
      println(f"Output File: ${new File(new File(".").getAbsoluteFile.getParent, fileName).getPath}")
    }
    else {
      System.err.println("The value is not \"plain\" or \"html\".")
      System.exit(-1)
    }
  }
}
