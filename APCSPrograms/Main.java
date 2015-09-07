/* AP Computer Science MOOC
 * Term 2- Assignment 5: Shuffle
 * Main Class
 * Gabrielle Kaili-May Liu
 * March 29, 2015 (created, completed)
 */

import java.util.ArrayList;

public class Main
{
  public static void main(String[] args)
  {
  // Initialize variables
    ArrayList <Card> h1 = new ArrayList<Card>();
    ArrayList <Card> h2 = new ArrayList<Card>();
    Deck sd = new Deck ();
    int s1 = 0;
    int s2 = 0;
    int count = 0;
    
  // Set Hand 1 and Hand 2
    while (count < 10)
    {
      int rem = count%2;
      if (rem == 0)
        h1.add(sd.getTopCard());
      else if (rem == 1)
        h2.add(sd.getTopCard());
      count++;
    }

  // Sum point values for Hand 1
    for (int i = 0; i < h1.size(); i++)
    {
      s1 += h1.get(i).pointValue();
    }
  // Sum point values for Hand 2
    for (int i = 0; i < h2.size(); i++)
    {
      s2 += h2.get(i).pointValue();
    }

  // Print out Hand 1
    String h1s = "Hand 1: total points ";
    h1s += s1;
    for (int i = 0; i < 5; i++)
    {
      h1s += "\n";
      h1s += h1.get(i).toString();
    }
    h1s += "\n";
    System.out.println(h1s);
    
  // Print out Hand 2
    String h2s = "Hand 2: total points "; 
    h2s += s2;
    for (int i = 0; i < 5; i++)
    {
      h2s += "\n";
      h2s += h2.get(i).toString();
    } 
    h2s += "\n";
    System.out.println(h2s);       
  // Decide who won
    if (s1 > s2)
      System.out.println("Hand 1 wins");
    else
      System.out.println("Hand 2 wins");
  }
}