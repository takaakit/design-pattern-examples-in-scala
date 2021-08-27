// ˅
package behavioralPatterns.chainOfResponsibility

// ˄

class LimitedSupporter(_name: String, _limitId: Int) extends Supporter(_name) {
  // ˅
  
  // ˄

  private val limitId: Int = _limitId

  // Troubles with an ID below the limit are handled.
  override protected def canHandle(trouble: Trouble): Boolean = {
    // ˅
    trouble.id <= limitId
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
