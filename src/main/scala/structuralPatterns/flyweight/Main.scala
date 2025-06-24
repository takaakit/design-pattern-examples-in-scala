package structuralPatterns.flyweight

import java.util.Scanner

/*
Display a string consisting of large characters (0-9 digits only).
Large character objects are not created until they are needed.
And the created objects are reused.

Example Output
-----
Please enter digits (ex. 1212123): 123

     ####
      ###
      ###
      ###
      ###
      ###
    #######



   ########
         ###
         ###
   ########
  #
  #
  ##########



   ########
         ###
         ###
   ########
         ###
  #      ###
   ########
*/

@main
def main(): Unit = {
  println("Please enter digits (ex. 1212123):")
  val scan = new Scanner(System.in)
  val inputValue = scan.next

  val lss = new LargeSizeString(inputValue)
  lss.display()
}
