// ˅
package behavioralPatterns.observer

// ˄

// Defines an updating interface for objects that should be notified of changes in a subject.
trait Observer {
  // ˅
  
  // ˄

  def update(changedSubject: Subject): Unit

  // ˅
  
  // ˄
}

// ˅

// ˄
