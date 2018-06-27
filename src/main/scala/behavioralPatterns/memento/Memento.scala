// ˅
package behavioralPatterns.memento

// ˄

class Memento(_money: Int) {
  // ˅
  
  // ˄

  // Money
  var money: Int = _money

  // Desserts
  var desserts: Seq[String] = Seq[String]()

  // Add a dessert
  def addDessert(dessert: String) = {
    // ˅
    desserts = desserts :+ dessert
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
