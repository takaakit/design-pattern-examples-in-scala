name := "design-pattern-examples-in-scala"
version := "0.1.0"
scalaVersion := "3.2.0"

// Add JavaFX dependencies
libraryDependencies ++= {
  // Determine OS version of JavaFX binaries
  val osName = System.getProperty("os.name") match {
    case n if n.startsWith("Linux")   => "linux"
    case n if n.startsWith("Mac")     => "mac"
    case n if n.startsWith("Windows") => "win"
    case _                            => throw new Exception("Unknown platform!")
  }
  Seq("base", "controls")
    .map(m => "org.openjfx" % s"javafx-$m" % "18.0.1" classifier osName)
}
