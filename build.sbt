name := "design-pattern-examples-in-scala"
version := "0.1.0"
scalaVersion := "3.1.3"

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
    .map(m => "org.openjfx" % s"javafx-$m" % "11" classifier osName)
}
