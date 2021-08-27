// ˅
package behavioralPatterns.observer

// ˄

// Provides an interface for attaching and detaching Observer objects.
abstract class Subject {
  // ˅
  
  // ˄

  private var observers: Seq[Observer] = Seq[Observer]()

  def attach(observer: Observer): Unit = {
    // ˅
    observers = observers :+ observer
    // ˄
  }

  def detach(observer: Observer): Unit = {
    // ˅
    observers.filter(_ != observer)
    // ˄
  }

  def notifyObservers(): Unit = {
    // ˅
    observers.foreach(observer => observer.update(this))
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
