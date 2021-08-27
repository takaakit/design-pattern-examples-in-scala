package structuralPatterns.adapter

/*
Display the given string as follows
```
-- Nice to meet you --
```
or display it as follows.
```
[[ Nice to meet you ]]
```
*/

object Main {
  def main(args: Array[String]): Unit = {
    val p = new PrintMessageDisplay("Nice to meet you")
    p.printWeak()
    p.printStrong()
  }
}
