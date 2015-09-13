/*
ID: kj4mxc1
LANG: JAVA
TASK: friday
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.PrintWriter;

public class friday
{
  public static boolean isLeapYear(int year)
  {
    if (year%100 == 0)
    {
      if (year%400 == 0)
        return true;
      return false;
    }
    else if (year%4 == 0)
      return true;
    return false;
  }
  
  public static int dayOfWeek(int m, int y)
  {
    int month = m;
    int year = y;
    ArrayList<Integer> monthDays = new ArrayList<Integer>();
    monthDays.add(31);
    monthDays.add(28);
    monthDays.add(31);
    monthDays.add(30);
    monthDays.add(31);
    monthDays.add(30);
    monthDays.add(31);
    monthDays.add(31);
    monthDays.add(30);
    monthDays.add(31);
    monthDays.add(30);
    monthDays.add(31);
    
  // calculate sumA
    int numLeapYears=0;
    int sumA = (year-1900)*365;

  // assume all divisible by 4 is leap year
    numLeapYears = (year-1900)/4;
    
  // subtract century years
    int numCents = (year-1900)/100;
    int numLC=0;
    if (year>=2000)
    {
      numLC = (year-2000)/400 + 1;
    }
    numLeapYears = numLeapYears - numCents + numLC; //get rid of non-leap century years
    
  // check if current year is leap
    if (year%400 == 0) //check if leap century year
    {
      if (month < 3)// check if month is jan or feb
        numLeapYears--; //subtract 1 if is jan or feb
    }
    else if (year%4 == 0 && year%100 != 0)//check if leap non-century year
    {
      if (month < 3) // check if month is jan or feb
        numLeapYears--; // subtract 1 if is jan or feb
    }

    sumA += numLeapYears; //add leap days
    
  // calculate days between 1/1/year to month/13/year
    int monthDist = month-1;
    for (int i=0; i<monthDist; i++)
      sumA += monthDays.get(i);
    sumA+=12;


  // calculate and return index of day to increment 
    return sumA%7;
  }
  
  public static void main(String arg[]) throws IOException
  {
    BufferedReader number = new BufferedReader(new FileReader("friday.in"));
    int N = Integer.parseInt(number.readLine());
    ArrayList<Integer> daysOfWeek = new ArrayList<Integer>();
    
    for (int i = 0; i<7; i++)
      daysOfWeek.add(0);
    
    for (int year = 1900; year<1900+N; year++)
    {
      for (int month = 1; month < 13; month++)
      {
        int dayIndex = dayOfWeek(month,year);
        int orig = daysOfWeek.get(dayIndex);
        orig++;
        daysOfWeek.set(dayIndex, orig);
      }
    }
  // return file with Saturday to Friday frequencies
    String frequencies = "";
    frequencies += daysOfWeek.get(5);
    frequencies += " ";
    frequencies += daysOfWeek.get(6);
    frequencies += " ";
    frequencies += daysOfWeek.get(0);
    frequencies += " ";
    frequencies += daysOfWeek.get(1);
    frequencies += " ";
    frequencies += daysOfWeek.get(2);
    frequencies += " ";
    frequencies += daysOfWeek.get(3);
    frequencies += " ";
    frequencies += daysOfWeek.get(4);
    PrintWriter writer = new PrintWriter("friday.out", "UTF-8");
    writer.println(frequencies);
    writer.close();  
    System.out.println(frequencies);
  }
}