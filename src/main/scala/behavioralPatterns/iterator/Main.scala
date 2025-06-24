package behavioralPatterns.iterator

/*
Add books in a bookshelf and display the names of the book in turn.
 */

@main
def main(): Unit = {
  val bookShelf = new BookShelf(5)
  bookShelf.add(new Book("Design Patterns: Elements of Reusable Object-Oriented Software"))
  bookShelf.add(new Book("The Object Primer: Agile Model-Driven Development with UML 2.0"))
  bookShelf.add(new Book("Software Systems Architecture: Working With Stakeholders Using Viewpoints and Perspectives"))
  bookShelf.add(new Book("A Practical Guide to SysML: The Systems Modeling Language"))
  bookShelf.add(new Book("A Pattern Language: Towns, Buildings, Construction"))

  val it = bookShelf.iterator()
  while (it.hasNext()) {
    val book = it.next().asInstanceOf[Book]
    println(book.title)
  }
}
