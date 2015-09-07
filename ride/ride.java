/*
ID: kj4mxc1
LANG: JAVA
TASK: ride
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;

public class ride
{
  public static int getValue(char letter)
  {
    ArrayList<Character> letters = new ArrayList<Character>();
    letters.add('A');
    letters.add('B');
    letters.add('C');
    letters.add('D');
    letters.add('E');
    letters.add('F');
    letters.add('G');
    letters.add('H');
    letters.add('I');
    letters.add('J');
    letters.add('K');
    letters.add('L');
    letters.add('M');
    letters.add('N');
    letters.add('O');
    letters.add('P');
    letters.add('Q');
    letters.add('R');
    letters.add('S');
    letters.add('T');
    letters.add('U');
    letters.add('V');
    letters.add('W');
    letters.add('X');
    letters.add('Y');
    letters.add('Z');
    int letterValue = letters.indexOf(letter)+1;
    System.out.println(letterValue);
    return letterValue;
  }
  public static void main(String arg[]) throws IOException
  {
    BufferedReader data = new BufferedReader(new FileReader("ride.in"));
    String cometName = data.readLine(); //get comet name
    String groupName = data.readLine(); //get group name
    int cometNameLength = cometName.length(); //get number of characters in comet name
    int groupNameLength = groupName.length(); //get number of characters in group name
    int cometProduct = 1;
    int groupProduct = 1;
    
 //calculate product of letters in comet name  
    for (int i = 0; i < cometNameLength; i++)
    {
      cometProduct *= getValue(cometName.charAt(i));
    }
 //calculate product of letters in group name
    for (int i = 0; i < groupNameLength; i++)
    {
      groupProduct *= getValue(groupName.charAt(i));
    }
    
    int cometResidue = cometProduct%47; //calculate comet value mod 47
    int groupResidue = groupProduct%47; //calculate group value mod 47
    
    PrintWriter writer = new PrintWriter("ride.out", "UTF-8");
    if (cometResidue == groupResidue)
    {
      writer.println("GO");
      writer.close();
    }
    writer.println("STAY");
    writer.close();
  }
  
}