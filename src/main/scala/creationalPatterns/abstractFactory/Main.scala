package creationalPatterns.abstractFactory

import creationalPatterns.abstractFactory.factory.Factory
import creationalPatterns.abstractFactory.listFactory.ListFactory
import creationalPatterns.abstractFactory.tableFactory.TableFactory

import java.util.InputMismatchException
import java.util.Scanner

/*
Create a hierarchical link collection as an HTML file. It can be created in either tabular or list format.
*/

object Main {
  def main(args: Array[String]): Unit = {
    println("Please enter a number (1 or 2):")
    println("  1: Create objects by using ListFactory")
    println("  2: Create objects by using TableFactory")
    val scan = new Scanner(System.in)
    var number = 0
    try number = scan.nextInt
    catch {
      case e: InputMismatchException =>
        System.err.println("Unexpected value.")
        System.exit(-1)
    }

    var factory: Factory = null
    if (number == 1) {
      factory = new ListFactory
    }
    else if (number == 2) {
      factory = new TableFactory
    }
    else {
      System.err.println("The value is not 1 or 2.")
      System.exit(-1)
    }

    val washingtonPost = factory.createLink("The Washington Post", "https://www.washingtonpost.com/")
    val newYorkTimes = factory.createLink("The NewYork Times", "https://www.nytimes.com/")
    val financialTimes = factory.createLink("The Financial Times", "https://www.ft.com/")

    val newspaper = factory.createData("Newspaper")
    newspaper.add(washingtonPost)
    newspaper.add(newYorkTimes)
    newspaper.add(financialTimes)

    val yahoo = factory.createLink("Yahoo!", "https://www.yahoo.com/")
    val google = factory.createLink("Google", "https://www.google.com/")

    val searchEngine = factory.createData("Search engine")
    searchEngine.add(yahoo)
    searchEngine.add(google)

    val linkPage = factory.createPage("LinkPage", "James Smith")
    linkPage.add(newspaper)
    linkPage.add(searchEngine)

    linkPage.output()
  }
}
