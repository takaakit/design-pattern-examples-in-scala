package structuralPatterns.facade

// Create a simple homepage.

object Main {
  def main(args: Array[String]): Unit = {
    PageCreator.createSimpleHomepage("emily@example.com", "Homepage.html")
  }
}
