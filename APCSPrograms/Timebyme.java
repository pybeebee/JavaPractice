/*
 * AP CS MOOC
 * January 23, 2014
 * Term 2 - Assignment 1: Time
 * A class which represents the time of day in hours and seconds.
 */
import java.lang.String;

public class Time
{
     private int hour;
     private int minute;     
     
     /* Complete required constructors and methods here */    
     public Time()
     /*Default constructor that sets time to 1200.*/ 
     {
       hour = 12;
       minute = 0;
     }
     
     public Time(int h, int m)
     /*
      * If h is between 1 and 23 inclusive, set the hour to h. 
      * Otherwise, set the hour to 0. If m is between 0 and 59 inclusive, 
      * set the minutes to m. Otherwise, set the minutes to 0. 
      */ 
     {
       if (h>=1 && h<=23){
         hour = h;}
       else{
         hour = 0;}
       if (m>=0 && m<=59){
         minute = m;}
       else{
         minute = 0;}        
     }
     
     public String toString()
     /* Returns the time as a String of length 4 in the format: 0819. 
      * Notice that if the hour or minute is one digit, it should 
      * print a zero first. For example, 6 should print as 06.
     */
     {
       String timestring = "";
       if (hour == 0){
         timestring += "00";}
       else if (hour>0 && hour<10){
         timestring += "0";
         timestring += String.valueOf(hour);}
       else if (hour>=10){
         timestring += String.valueOf(hour);}
       if (minute == 0){
         timestring += "00";}
       else if (minute>0 && minute <10){
         timestring += "0";
         timestring += String.valueOf(minute);}
       else if (minute>=10){
         timestring += String.valueOf(minute);}
       return timestring;
     }
     
     public String convert()
     /*
      * Returns the time as a String converted from military time 
      * to standard time. For example, 0545 becomes 5:45 am and 
      * 1306 becomes 1:06 pm.
      */ 
     {
       String standard = "";
       if (hour==0 || hour==12){
         standard += "12";}
       if (hour>0 && hour<10){
         String newhour = String.valueOf(hour);
         standard += newhour;}
       if (hour>=10 && hour!=12){
         int temp = hour%12;
         String newhour = String.valueOf(temp);
         standard += newhour;}
       standard += ":";
       if (minute==0){
         standard += "00";}
       if (minute>0 && minute <10){
         standard += "0";
         standard += String.valueOf(minute);}
       if (minute>=10){
         standard += String.valueOf(minute);}
       standard += " ";
       if (hour>=0 && hour<=11){
         standard += "am";}
       if (hour>=12 && hour<=23){
         standard += "pm";}
       return standard;
     }
      
    public void increment()
    /*
     * Advances the time by one minute. 
     * Remember that 60 minutes = 1 hour. 
     * Therefore, if your time was 0359, and you add one minute, 
     * it becomes 0400. 2359 should increment to 0000.
     */
    {
      minute += 1;
      if (minute >= 60){
        hour = (hour+1)%24;
        minute = minute%60;}            
    }    
}