/* AP CS MOOC
 * Term 2 - Assignment 4: Time Comparable
 * You can use this solution to Assignment 1 in order to create a comparable time object.
 * You will need to change the class so that it implements the comparable interface.
 * March 5, 2015
 * Gabrielle Kaili-May-Liu
 */
import java.lang.Math;

public class Time implements Comparable
{
  private int hour;
  private int minute;
  
  public Time()
  /*
   * Sets the default time to 12:00.
   */
  {
    this(12, 0);
  }
  public Time(int h, int m)
  /*
   * Sets hour to h and minute to m.
   */
  {
    hour = 0;
    minute = 0;
    if (h >=1 && h <= 23)
      hour = h;
    if (m >= 1 && m <= 59)
      minute = m;  
  }    
  public String toString()
    /*
     * Returns the time as a String of length 4 in the format: 0819.
     */
  {          
    String h = "";
    String m = "";
    if ( hour <10)
      h +="0";
    if (minute <10)
      m +="0";
    h += hour;
    m += minute;
    
    return "" + h + "" + m;
  }
  
  public int compareTo(Object other)
  /* Returns -1 if current time is less than other.
   * Returns 0 if current time is equal to other.
   * Returns 1 if current time is greater than other.
   */
  {
    Time temp = (Time) other;
    if (hour < temp.hour){
      return -1;}
    else if (hour > temp.hour){
      return 1;}
    else
    {
      if (minute < temp.minute){
        return -1;}
      else if (minute > temp.minute){
        return 1;}
      else{
        return 0;}
    }
  }
  public String difference(Time t)
  /* Returns a String holding the difference between the current time and 
   * the Time t passed in via parameter. All values should be positive, 
   * and in the format: 
   * 08:09 
   * 10:35
   */
  {
    String timedif = "";
    int ctm = hour*60;
    ctm += minute;
    int ttm = t.hour*60;
    ttm += t.minute;
    int td = Math.abs(ctm - ttm);
    int hd = td/60;
    int md = td%60;
    if (hd < 10){
      timedif +="0";}
    timedif += hd;
    timedif += ":";
    if (md < 10){
      timedif +="0";}
    timedif += md;
    return timedif;
  }
}