// ˅
package behavioralPatterns.chainOfResponsibility

// ˄

class LazySupporter(_name: String) extends Supporter(_name) {
  // ˅
  
  // ˄

  // No troubles are handled.
  override protected def canHandle(trouble: Trouble): Boolean = {
    // ˅
    false
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
