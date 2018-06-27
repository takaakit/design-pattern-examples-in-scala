// ˅
package behavioralPatterns.chainOfResponsibility

// ˄

abstract class Supporter(_name: String) {
  // ˅
  
  // ˄

  // Supporter name
  private val name: String = _name

  // Next supporter
  private var next: Supporter = null

  // Trouble support
  // Troubles are sent around.
  def support(trouble: Trouble): Unit = {
    // ˅
    if (handle(trouble)) {
      supported(trouble)
    }
    else if (next != null) {
      next.support(trouble)
    }
    else {
      unsupported(trouble)
    }
    // ˄
  }

  // Set a next supporter.
  def setNext(_next: Supporter): Supporter = {
    // ˅
    this.next = _next
    next
    // ˄
  }

  override def toString(): String = {
    // ˅
    f"[$name]"
    // ˄
  }

  protected def handle(trouble: Trouble): Boolean

  // Trouble was supported.
  private def supported(trouble: Trouble): Unit = {
    // ˅
    println(f"${trouble.toString()} was handled by $this.")
    // ˄
  }

  // Trouble was unsupported.
  private def unsupported(trouble: Trouble): Unit = {
    // ˅
    println(f"${trouble.toString()} was not handled.")
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
