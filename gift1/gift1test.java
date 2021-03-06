/*
ID: kj4mxc1
LANG: JAVA
TASK: gift1
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class gift1test
{
  public static void main(String arg[]) throws IOException
  {
    ArrayList<String> lines = new ArrayList<String>();
    ArrayList<String> people = new ArrayList<String>();
    ArrayList<Integer> money = new ArrayList<Integer>();   
    BufferedReader file = new BufferedReader(new FileReader("/Users/pybeebee/Desktop/USACO Stuff/gift1.in"));

// get each line of text into ArrayList lines
    for (String l = file.readLine(); l != null; l = file.readLine())
    {
      lines.add(l);
    }
// fill list of people
    int NP = Integer.parseInt(lines.get(0));
    for (int i = 1; i <= NP; i++)
    {
      people.add(lines.get(i));
      money.add(0);
    }
// fill list of money and gift money for each person
    int l = NP + 1;
    for (int j = l; j <= lines.size(); j++)
    {
      int index = lines.indexOf(lines.get(l));
      int gmval;
      int remval;
      int gm[] = new int[2];
// get the total gift money and number of people from the line
      int a = 0;
      for (String val: lines.get(j+1).split(" ", 2))
      {
        gm[a] = Integer.parseInt(val);
        a++;
      }
      money.add(gm[0]); // set money for person at line l
// calculate gift money for the listed people and remaining money
      if (gm[0]!=0 && gm[1]!=0)
      {
        gmval = gm[0]/gm[1];
        remval = gm[0]%gm[1];
// return remaining money to owner
        int cur = money.get(index);
        money.set(index, remval+cur);
// deposit gift money to the listed people
        for (int n = 1; n<=gm[1]; n++)
        {
          int ind = lines.indexOf(lines.get(n));
          int cur2 = money.get(index);
          money.set(index, gmval+cur2);
        }
        System.out.println(j);
        j+= gm[1];
        j++;
        System.out.println(j);
      }
           }
// print the resulting money stuff
  for (int i = 0; i < NP; i++)
  {
    String person = people.get(i);
    int balance = money.get(i);
    String data = person + " " + balance;
    System.out.println(data);
  }
  }
}         