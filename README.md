[<img src="./screenshots/AllPatterns.svg">](https://raw.githubusercontent.com/takaakit/design-pattern-examples-in-scala/master/screenshots/AllPatterns.svg)

Design Pattern Examples in Scala
===

Model and code examples of GoF Design Patterns for Scala.  
This project is available for the following objectives:  

* To understand GoF Design Pattern examples in Scala.
* To understand the mapping between UML model and Scala code.
* To try model-driven development (MDD) using Astah and m plus plug-in.

> UML model example:

![](./screenshots/CompositePattern.svg "Composite Pattern")

<a id="code-example"></a>
> Scala code example:

```scala
// ˅
package structuralPatterns.composite

// ˄

class File(_name: String, _size: Int) extends FileSystemElement {
  // ˅
  
  // ˄

  private val name: String = _name

  private val size: Int = _size

  override def getName(): String = {
    // ˅
    name
    // ˄
  }

  override def getSize(): Int = {
    // ˅
    size
    // ˄
  }

  // Print this element with the "upperPath".
  override def print(upperPath: String): Unit = {
    // ˅
    println(f"$upperPath/$this")
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
```

Installation
------------
**UML Modeling Tool**
* Download the modeling tool [Astah](https://astah.net/download) UML/Professional **ver.10.0.0** or higher, and install.  
* Download [m plus](https://sites.google.com/view/m-plus-plugin/download) plug-in **ver.3.1.3-preview.1** or higher, and add it to Astah.  
  [How to add plugins to Astah](https://astahblog.com/2014/12/15/astah_plugins/)

**Scala Development Environment**
* Install Java SDK **21** or higher.
* Install [IntelliJ IDEA](https://www.jetbrains.com/idea/download/). Then, install [Scala plugin](https://plugins.jetbrains.com/plugin/1347-scala) in IntelliJ.  
**Note:** IntelliJ IDEA (with the Scala plugin) will automatically download and configure the required versions of the **Scala SDK** and **sbt** the first time you open this project. Simply click **Download** when the IDE prompts you, and continue once the setup completes.

**Project Requirements**
* Scala: **3.7.1**
* SBT: **1.11.2** or higher
* JavaFX: **21.0.2** (automatically managed by SBT)

Usage
-----
**Code Generation from UML**
  1. Open the Astah file (model/DesignPatternExamplesInScala.asta).
  2. Select model elements on the model browser of Astah.
  3. Click the **Generate Code** button.  
  ![](./screenshots/GenerateCode.gif "Generate Code")  
  The generated code has **User Code Area**. The User Code Area is the area enclosed by "˅" and "˄". Handwritten code written in the User Code Area remains after a re-generation. [View code example](#code-example).  
  For detailed usage of the tools, please see [Astah Manual](https://astah.net/manual) and [m plus plug-in tips](https://sites.google.com/view/m-plus-plugin-tips).

**Build and Run**
  1. Open the project root directory (design-pattern-examples-in-scala) in IntelliJ IDEA.
  2. Open `Main.scala` for the pattern you want to run, and click `Run` icon in the left gutter.  
     ![](./screenshots/BuildAndRun.gif "Build and Run")

References
----------
* Gamma, E. et al. Design Patterns: Elements of Reusable Object-Oriented Software, Addison-Wesley, 1994
* Hiroshi Yuki. Learning Design Patterns in Java [In Japanese Language], Softbank publishing, 2004

License
-------
This project is licensed under the Creative Commons Zero (CC0) license. The model and code are completely free to use.

[![CC0](https://i.creativecommons.org/p/zero/1.0/88x31.png "CC0")](https://creativecommons.org/publicdomain/zero/1.0/deed)

Other Language Examples
-----------------------
[C++](https://github.com/takaakit/design-pattern-examples-in-cpp), [C#](https://github.com/takaakit/design-pattern-examples-in-csharp), [Crystal](https://github.com/takaakit/design-pattern-examples-in-crystal), [Go](https://github.com/takaakit/design-pattern-examples-in-golang), [Java](https://github.com/takaakit/design-pattern-examples-in-java), [JavaScript](https://github.com/takaakit/design-pattern-examples-in-javascript), [Kotlin](https://github.com/takaakit/design-pattern-examples-in-kotlin), [Python](https://github.com/takaakit/design-pattern-examples-in-python), [Ruby](https://github.com/takaakit/design-pattern-examples-in-ruby), [Swift](https://github.com/takaakit/design-pattern-examples-in-swift), [TypeScript](https://github.com/takaakit/design-pattern-examples-in-typescript)
