// ˅
package behavioralPatterns.chainOfResponsibility

// ˄

class SpecialSupporter(_name: String, _targetId: Int) extends Supporter(_name) {
  // ˅
  
  // ˄

  private val targetId: Int = _targetId

  // Troubles with the specific ID are handled.
  override protected def handle(trouble: Trouble): Boolean = {
    // ˅
    trouble.id == targetId
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
