/*
ID: kj4mxc1
LANG: JAVA
TASK: milk2
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.io.PrintWriter;

public class milk2
{
  public static void main(String arg[]) throws IOException
  {
    BufferedReader reader = new BufferedReader(new FileReader("milk2.in"));
    int N = Integer.parseInt(reader.readLine());
    int[] startTimes = new int[N];
    int[] endTimes = new int[N];
    String lineData;
    String[] twoNums;
    int minTime;
    int maxTime;
    int amTime;
    int milkingTop;
    int idleTop;
    
 //get each startTime and endTime pair, store in respective lists
    for (int i = 0; i < N; i++)
    {
      lineData = reader.readLine();
      twoNums = lineData.split(" ");
      int startTime = Integer.parseInt(twoNums[0]);
      int endTime = Integer.parseInt(twoNums[1]);
      startTimes[i] = startTime;
      endTimes[i] = endTime;
    }
    
 //get minTime and maxTime to initialize boolean array
    Arrays.sort(startTimes);
    Arrays.sort(endTimes);
    minTime = startTimes[0];
    maxTime = endTimes[N-1];
    amTime = maxTime - minTime;
    boolean[] milkTimes = new boolean[amTime];
    Arrays.fill(milkTimes, false);
    
 //set values in boolean array
    int b;
    for (int i = 0; i < N; i++)
    {
      b = endTimes[i] - minTime;
      for (int a = startTimes[i]-minTime; a < b; a++)
        milkTimes[a] = true;
    }
    
 //count up all milking and non-milking intervals
    ArrayList<Integer> trueList = new ArrayList<Integer>();
    ArrayList<Integer> falseList = new ArrayList<Integer>();
    int count = 1;
    for (int i = 1; i < amTime; i++)
    {
      if (milkTimes[i] == milkTimes[i-1])
      {
        count++;
      }
      else
      {
        if (milkTimes[i-1] == true)
          trueList.add(count);
        else
          falseList.add(count);
        count = 1;
      }
      if (i == amTime-1)
      {
        if (milkTimes[i-1] == true)
          trueList.add(count);
        else
          falseList.add(count);
        count = 1;
      }
    }
    
 //calculate maximum milking and non-milking times, compile as String
    if (trueList.size() > 0)
    {
      Collections.sort(trueList);
      milkingTop = trueList.get(trueList.size()-1);
    }
    else
    {
      milkingTop = 0;
    }
    if (falseList.size() > 0)
    {
      Collections.sort(falseList);
      idleTop = falseList.get(falseList.size()-1);
    }
    else
    {
      idleTop = 0;
    }
    String data = "";
    data += milkingTop;
    data += " ";
    data += idleTop;
    
 //open PrintWriter, export information as file "milk2.out", close PrintWriter
    PrintWriter writer = new PrintWriter("milk2.out", "UTF-8");
    writer.println(data);
    writer.close();
  }
}