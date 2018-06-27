// ˅
package behavioralPatterns.iterator

// ˄

class BookShelf(maxsize: Int) extends Aggregate {
  // ˅
  
  // ˄

  var numberOfBooks: Int = 0

  private val books: Array[Book] = new Array[Book](maxsize)

  override def iterator(): Iterator = {
    // ˅
    new BookShelfIterator(this)
    // ˄
  }

  def getAt(index: Int): Book = {
    // ˅
    books.apply(index)
    // ˄
  }

  def add(book: Book) = {
    // ˅
    books.update(numberOfBooks, book)
    numberOfBooks += 1
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
