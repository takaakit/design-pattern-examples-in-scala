// ˅
package behavioralPatterns.observer

// ˄

// An abstract class that generates numbers.
abstract class Number {
  // ˅
  
  // ˄

  var value: Int

  private var observers: Seq[Observer] = Seq[Observer]()

  def generate()

  def addObserver(observer: Observer) = {
    // ˅
    observers = observers :+ observer
    // ˄
  }

  def deleteObserver(observer: Observer) = {
    // ˅
    observers.filter(_ != observer)
    // ˄
  }

  def notifyObservers() = {
    // ˅
    observers.foreach(observer => observer.update(this))
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
