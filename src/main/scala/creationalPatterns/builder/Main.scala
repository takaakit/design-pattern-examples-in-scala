package creationalPatterns.builder

// Create documents in HTML format and text format.

object Main {
  def main(args: Array[String]): Unit = {
    if (args.size != 1) {
      showUsage()
    }
    else if (args.apply(0) == "plain") {
      val plainTextBuilder: PlainTextBuilder = new PlainTextBuilder()
      val director: Director = new Director(plainTextBuilder)
      director.build()
      val content = plainTextBuilder.result
      println(content)
    }
    else if (args.apply(0) == "html") {
      val htmlBuilder: HTMLBuilder = new HTMLBuilder()
      val director: Director = new Director(htmlBuilder)
      director.build()
      val filename = htmlBuilder.result
      println(f"$filename has been created.")
    }
    else {
      showUsage()
    }

    def showUsage() {
      println("Usage 1: java Main plain      <- Create a document in plain text.")
      println("Usage 2: java Main html       <- Create a document in HTML.")
    }
  }
}
