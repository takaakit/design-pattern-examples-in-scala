// ˅
package creationalPatterns.builder

// ˄

class Director(_builder: Builder) {
  // ˅
  
  // ˄

  private val builder: Builder = _builder

  // Construct a document
  def build() = {
    // ˅
    builder.createTitle("Greeting")                                           // Title
    builder.createSection("Morning and Afternoon")                            // Section
    builder.createItems(Array("Good morning.", "Hello."))                   // Items
    builder.createSection("Evening")                                          // Other section
    builder.createItems(Array("Good evening.", "Good night.", "Goodbye."))  // Other items
    builder.close()
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
