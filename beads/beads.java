/*
ID: kj4mxc1
LANG: JAVA
TASK: beads
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class beads
{
  public static boolean sameColor(char current, char leftColor) //check if the current bead is the same color as the previous bead
  {
    if (current == 'w')
      return true;
    if (current == leftColor)
      return true;
    return false;
  }
  
  public static int modulo(int a, int b) //take the remainder of a divided by b
  {
    return ((a % b) + b) % b;
  }
  
  public static int count(ArrayList<Character> colorList, int slotindex, int numBeads)
  {
    int count = 0;
 //countLeft
    int leftIndex = modulo(slotindex-1, numBeads);
    char leftColor = colorList.get(leftIndex);
    while ((sameColor(colorList.get(leftIndex), leftColor)||(leftColor=='w')) && (count < numBeads))
    {
      count++;
      if (leftColor=='w')
        leftColor = colorList.get(leftIndex);
      leftIndex = modulo(leftIndex-1, numBeads);
    }   

 //countRight
    int rightIndex = slotindex;
    char rightColor = colorList.get(rightIndex);
    while ((sameColor(colorList.get(rightIndex), rightColor)||(rightColor=='w')) && (count < numBeads))
    {
      count++;
      if (rightColor=='w')
        rightColor = colorList.get(rightIndex);
      rightIndex = modulo(rightIndex+1, numBeads);
    }
    return count;
  }
  
  public static void main(String arg[]) throws IOException
  {
    BufferedReader reader = new BufferedReader(new FileReader("beads.in"));
    int numBeads = Integer.parseInt(reader.readLine()); //get number of beads
    String beadString = reader.readLine(); //get String of bead colors
    ArrayList<Character> colorList = new ArrayList<Character>();
    ArrayList<Integer> counts = new ArrayList<Integer>();
    
 //add bead colors to ArrayList colorList
    for (int i = 0; i < numBeads; i++)
      colorList.add(beadString.charAt(i));
    
 //loop through each slot
    char currentBeadColor = colorList.get(0);
    int count;
    for (int slotIndex = 0; slotIndex < numBeads; slotIndex++)
    {
      count = count(colorList, slotIndex, numBeads);
      counts.add(count);
    }
    int maxCount = Collections.max(counts);
    
 //export results as file
    PrintWriter writer = new PrintWriter("beads.out", "UTF-8");
    writer.println(maxCount);
    writer.close();
  }
}