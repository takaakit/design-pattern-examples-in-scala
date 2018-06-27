// ˅
package behavioralPatterns.chainOfResponsibility

// ˄

class Trouble(_id: Int) {
  // ˅
  
  // ˄

  // Trouble number
  val id: Int = _id

  override def toString(): String = {
    // ˅
    f"[Trouble $id]"
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
