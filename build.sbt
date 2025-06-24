ThisBuild / name := "design-pattern-examples-in-scala"
ThisBuild / version := "0.1.0"
ThisBuild / scalaVersion := "3.7.1"

// Add JavaFX dependencies
lazy val root = (project in file("."))
  .settings(
    libraryDependencies ++= {
      // Determine OS version of JavaFX binaries
      val osName = System.getProperty("os.name") match {
        case n if n.startsWith("Linux")   => "linux"
        case n if n.startsWith("Mac")     => "mac"
        case n if n.startsWith("Windows") => "win"
        case _                            => throw new Exception("Unknown platform!")
      }
      Seq("base", "controls", "fxml", "graphics", "media", "swing", "web")
        .map(m => "org.openjfx" % s"javafx-$m" % "21.0.2" classifier osName)
    }
  )
