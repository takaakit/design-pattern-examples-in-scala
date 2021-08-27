// ˅
package behavioralPatterns.chainOfResponsibility

// ˄

class MoodySupporter(_name: String) extends Supporter(_name) {
  // ˅
  
  // ˄

  // Troubles with an odd ID are handled.
  override protected def canHandle(trouble: Trouble): Boolean = {
    // ˅
    trouble.id % 2 == 1
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
