package behavioralPatterns.visitor

/*
Visitor visits the file system composed of files and directories, and displays a list of files/directories.
*/

@main
def main(): Unit = {
  println("Create a file system...")

  val binDir = new Directory("bin")
  val lsFile = new File("ls", 20)
  binDir.add(lsFile)

  val mkdirFile = new File("mkdir", 40)
  binDir.add(mkdirFile)

  val emilyDir = new Directory("emily")
  val homeworkFile = new File("homework.doc", 60)
  emilyDir.add(homeworkFile)

  val jamesDir = new Directory("james")
  val appFile = new File("app.exe", 80)
  jamesDir.add(appFile)

  val homeDir = new Directory("home")
  homeDir.add(emilyDir)
  homeDir.add(jamesDir)

  val rootDir = new Directory("root")
  rootDir.add(homeDir)
  rootDir.add(binDir)

  rootDir.accept(new ListVisitor)
}
