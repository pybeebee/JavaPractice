/* Term 2 Lesson 1 Activity 1
 * User inputs words @ command line
 * Stops accepting words when user enters "STOP"
 * Store words in ArrayList
 * "STOP" is not stored in the list
 * Print list size
 * Print contents of the list
 * Remove first & last words stored in the list
 * (only if list length > 2)
 * Reprint the contents of the list
 */
//import methods
import java.util.ArrayList;
import java.util.Scanner;
//initiate class and methods
class Main{
  public static void main (String str[]){
    //initiate list, initiate scanner, initiate scanner variable
    ArrayList list = new ArrayList();
    Scanner scan = new Scanner (System.in);
    String word = scan.nextLine();
    //enter more words, add to list
    while (word.equals("STOP") == false)
    {
      list.add(word);
      word = scan.nextLine();
    }
    //print size of list
    System.out.println(list.size());
    //print words in list
    System.out.println(list);
    
    //if length > 2:
    if (list.size() > 2)
    {
      //remove first & last terms
      list.remove(0);
      list.remove(list.size()-1);
      //reprint list
      System.out.println(list);
    }
  }
}
    