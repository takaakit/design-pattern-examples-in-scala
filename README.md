[<img src="./screenshots/AllPatterns.svg">](https://raw.githubusercontent.com/takaakit/design-pattern-examples-in-scala/master/screenshots/AllPatterns.svg)

Design Pattern Examples in Scala
===

Model and code examples of GoF Design Patterns for Scala.  
This project is available for the following objectives:  

* To understand GoF Design Pattern examples in Scala.
* To understand the mapping between UML model and Scala code.
* To try Model-Driven Development (MDD) using Astah and M PLUS plug-in.

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
* Download the modeling tool [Astah](https://astah.net/download) UML or Professional, and install.  
* Download [M PLUS](https://sites.google.com/view/m-plus-plugin/download) plug-in **ver.2.7.6** or higher, and add it to Astah.  
  [How to add plugins to Astah](https://astahblog.com/2014/12/15/astah_plugins/)

**Scala Development Environment**
* Install Java SDK **11** or higher.
* Install [IntelliJ](https://www.jetbrains.com/idea/download/). Then, install Scala and SBT plugin in IntelliJ.

Usage
-----
**Code Generation from UML**
  1. Open the Astah file (model/DesignPatternExamplesInScala.asta).
  2. Select model elements on the model browser of Astah.
  3. Click the **Generate Code** button.  
  ![](./screenshots/GenerateCode.gif "Generate Code")  
  The generated code has **User Code Area**. The User Code Area is the area enclosed by "˅" and "˄". Handwritten code written in the User Code Area remains after a re-generation. [View code example](#code-example).  
  For detailed usage of the tools, please see [Astah Manual](https://astah.net/manual) and [M PLUS plug-in Tips](https://sites.google.com/view/m-plus-plugin-tips).

**Build and Run**
  1. Open the project root directory (design-pattern-examples-in-scala) in IntelliJ.
  2. Open `Main.scala` for the pattern you want to run, and click `Run` icon in the left gutter.
     ![](./screenshots/BuildAndRun.gif "Build and Run")  

References
----------
* Gamma, E. et al. Design Patterns: Elements of Reusable Object-Oriented Software, Addison-Wesley, 1994
* Hiroshi Yuki. Learning Design Patterns in Java [In Japanese Language], Softbank publishing, 2004

Licence
-------
This project is licensed under the Creative Commons Zero (CC0) license. The model and code are completely free to use.

[![CC0](https://i.creativecommons.org/p/zero/1.0/88x31.png "CC0")](https://creativecommons.org/publicdomain/zero/1.0/deed)

Other Language Examples
-----------------------
[C++](https://github.com/takaakit/design-pattern-examples-in-cpp), [C#](https://github.com/takaakit/design-pattern-examples-in-csharp), [Crystal](https://github.com/takaakit/design-pattern-examples-in-crystal), [Go](https://github.com/takaakit/design-pattern-examples-in-golang), [Java](https://github.com/takaakit/design-pattern-examples-in-java), [JavaScript](https://github.com/takaakit/design-pattern-examples-in-javascript), [Kotlin](https://github.com/takaakit/design-pattern-examples-in-kotlin), [Python](https://github.com/takaakit/design-pattern-examples-in-python), [Ruby](https://github.com/takaakit/design-pattern-examples-in-ruby), [Swift](https://github.com/takaakit/design-pattern-examples-in-swift), [TypeScript](https://github.com/takaakit/design-pattern-examples-in-typescript)
