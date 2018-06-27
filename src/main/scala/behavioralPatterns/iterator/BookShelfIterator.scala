// ˅
package behavioralPatterns.iterator

// ˄

class BookShelfIterator(_bookShelf: BookShelf) extends Iterator {
  // ˅
  
  // ˄

  private var index: Int = 0

  private val bookShelf: BookShelf = _bookShelf

  override def hasNext(): Boolean = {
    // ˅
    index < bookShelf.numberOfBooks
    // ˄
  }

  override def next(): Any = {
    // ˅
    val book = bookShelf.getAt(index)
    index += 1
    book
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
