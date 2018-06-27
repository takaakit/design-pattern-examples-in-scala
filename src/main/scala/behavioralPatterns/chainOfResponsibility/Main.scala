package behavioralPatterns.chainOfResponsibility

// Someone handles a trouble.

object Main {
  def main(args: Array[String]): Unit = {
    val emily = new LazySupporter("Emily")
    val william = new MoodySupporter("William")
    val amelia = new SpecialSupporter("Amelia", 153)
    val michael = new SpecialSupporter("Michael", 340)
    val joseph = new LimitedSupporter("Joseph", 250)
    val lily = new LimitedSupporter("Lily", 350)

    // Make a chain.
    emily.setNext(william).setNext(amelia).setNext(michael).setNext(joseph).setNext(lily)

    // Various troubles occurred.
    for (i <- 0 until 500 by 17) {
      emily.support(new Trouble(i))
    }
  }
}
