package creationalPatterns.singleton

object Main {
  def main(args: Array[String]): Unit = {
    val obj1 = Singleton
    val obj2 = Singleton
    if (obj1 == obj2) {
      println("obj1 and obj2 are the same instance.")
    }
    else {
      println("obj1 and obj2 are different instances.")
    }
  }
}
