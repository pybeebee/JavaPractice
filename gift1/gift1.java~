/*
ID: kj4mxc1
LANG: JAVA
TASK: gift1
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.PrintWriter;

public class gift1
{
  public static void main (String arg[]) throws IOException
  {
    ArrayList<String> lines = new ArrayList<String>();
    ArrayList<String> people = new ArrayList<String>();
    ArrayList<Integer> finalMoney = new ArrayList<Integer>();   
    BufferedReader file = new BufferedReader(new FileReader("gift1.in"));
    
// get number of people
    int NP = Integer.parseInt(file.readLine());
// put people in list people and initialize initial and final money values
    for (int i = 0; i<NP; i++)
    {
      people.add(file.readLine());
      finalMoney.add(0);
    }
// distribute gift money and remaining money for each giver
    String giver;
    String moneyInfo[] = new String[2];
    int giverIndex;
    int giverOrig;
    int totalMoney;
    int numGifts;
    int giftMoney;
    int receiverIndex;
    int recOrig;
    
    while ((giver = file.readLine()) != null)
    {
      giverIndex = people.indexOf(giver); 
      giverOrig = finalMoney.get(giverIndex);
      
      // get money info

      moneyInfo = file.readLine().split(" ");
      totalMoney = Integer.parseInt(moneyInfo[0]);
      numGifts = Integer.parseInt(moneyInfo[1]);
      if (totalMoney==0 ||(totalMoney!=0 && numGifts==0))
        giftMoney = 0;
      else
        giftMoney = totalMoney/numGifts;
      finalMoney.set(giverIndex, giverOrig-(giftMoney*numGifts));
      
      
// distribute money to the receivers
      for (int i = 0; i<numGifts; i++)
      {
        receiverIndex = people.indexOf(file.readLine());
        recOrig = finalMoney.get(receiverIndex);
        finalMoney.set(receiverIndex, recOrig+giftMoney);
      }
    }
// print net gain or loss for each person
    String result;
    PrintWriter writer = new PrintWriter("gift1.out", "UTF-8");
    for (int i = 0; i<NP; i++)
    {
      result = people.get(i) + " " + finalMoney.get(i);
      writer.println(result);
    }
    writer.close();
  } 
}