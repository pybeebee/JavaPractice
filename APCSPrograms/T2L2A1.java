/* Term 2 Lesson 2 Activity 1
 * User inputs words @ command line
 * Stops accepting words when "STOP" is entered
 * Store words in ArrayList
 * "STOP" is not stored in list
 * loop through, only print words with "a"
 */
//import methods
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;

//initialize class and methods
class Main{
  public static void main(String str[]){
    //initialize list, initialize scanner, initialize scanner variable
    ArrayList list = new ArrayList();
    Scanner scan = new Scanner (System.in);
    System.out.println("Please enter words. Enter 'STOP' to stop the loop.");
    String word = scan.nextLine();
    //enter more words, add to list
    while (word.equals("STOP") == false)
    {
      list.add(word);
      word = scan.nextLine();
    }
    //loop through, find words containing "a"
    for (int i = 0; i < list.size(); i++)
    {
      String value = (String) list.get(i);
      if (value.indexOf('a') != -1 )
      {
        System.out.println(list.get(i));
      }
    }
  }
}
