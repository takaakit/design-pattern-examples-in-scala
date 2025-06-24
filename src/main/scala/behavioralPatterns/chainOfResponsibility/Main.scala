package behavioralPatterns.chainOfResponsibility

/*
A trouble is turned around among supporters, and the trouble will be handled by the supporter who can handle it.
There are four types of supporters below:
* LazySupporter doesn't handle any trouble
* MoodySupporter handles odd ID troubles
* SpecialSupporter handles a trouble of the target ID.
* LimitedSupporter handles troubles below the limit ID.
*/

@main
def main(): Unit = {
  val emily = new LazySupporter("Emily")
  val william = new MoodySupporter("William")
  val amelia = new SpecialSupporter("Amelia", 6)
  val joseph = new LimitedSupporter("Joseph", 5)

  // Make a chain.
  emily.setNext(william).setNext(amelia).setNext(joseph)

  // Various troubles occurred.
  for (i <- 0 until 10) {
    emily.support(new Trouble(i))
  }
}
