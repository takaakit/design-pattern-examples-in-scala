package structuralPatterns.composite

// Represents a file system composed of files and directories.

object Main {
  def main(args: Array[String]): Unit = {
    println("Create a file system...")
    val rootDir: Directory = new Directory("root")
    val homeDir: Directory = new Directory("home")
    val binDir: Directory = new Directory("bin")
    val etcDir: Directory = new Directory("etc")
    val emilyDir: Directory = new Directory("emily")
    val jamesDir: Directory = new Directory("james")
    val oliviaDir: Directory = new Directory("olivia")

    rootDir.add(homeDir)
    rootDir.add(binDir)
    rootDir.add(etcDir)

    binDir.add(new File("ls", 100))
    binDir.add(new File("mkdir", 50))
    homeDir.add(emilyDir)
    homeDir.add(jamesDir)
    homeDir.add(oliviaDir)

    emilyDir.add(new File("homework.doc", 40))
    jamesDir.add(new File("homework.doc", 50))
    jamesDir.add(new File("app.exe", 60))
    oliviaDir.add(new File("homework.doc", 70))
    oliviaDir.add(new File("app.exe", 80))
    oliviaDir.add(new File("tips.html", 90))

    rootDir.print("")
  }
}
