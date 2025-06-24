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

@main
def main(): Unit = {
  val p = new PrintMessageDisplay("Nice to meet you")
  p.printWeak()
  p.printStrong()
}
