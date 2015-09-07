/*
 * Unit 3
 * Assignment 4
 * Write a Tweet Tester.
 * Enter a possible tweet, return some info.
 */ 

import java.util.Scanner;
import java.lang.Math; 

class Main {
    public static void main(String[] args)
     {
/*
 * Write your code here
 * Copy and paste your entire program to Code Runner
 * to complete the activity, from the first import statement
 * to the last bracket.
 */
      int exchar = 0;
      int hashnum = 0;
      int atnum = 0;
      int linknum = 0;
      int hashc = 0;
      int atc = 0;
      int linkc = 0;
      Scanner scan = new Scanner (System.in);
      System.out.println("Please enter a tweet:");
      String tweet = scan.nextLine();
      if (tweet.length() > 140){
        exchar = tweet.length() - 140;
        System.out.println("Excess Characters: " + exchar);}
      
      else{
        System.out.println("Length Correct");
        for (int h = 0; h < tweet.length() - 1; h++){
          if (tweet.charAt(h) == '#'){
            if ((tweet.charAt(h+1) != ' ') && (tweet.charAt(h+1) != '\t')){ 
              hashc++;}}}
        
        for (int a = 0; a < tweet.length() - 1; a++){
          if (tweet.charAt(a) == '@'){
            if ((tweet.charAt(a+1) != ' ') && (tweet.charAt(a+1) != '\t')){ 
              atc++;}}}
        
        for (int i = 0; i < tweet.length() - 1; i++){
          if ((tweet.charAt(i) == 'h') || (tweet.charAt(i) == 'H')){
              if ((tweet.charAt(i+1) == 't') || (tweet.charAt(i+1) == 'T')){
                if ((tweet.charAt(i+2) == 't') || (tweet.charAt(i+2) == 'T')){
                  if ((tweet.charAt(i+3) == 'p') || (tweet.charAt(i+3) == 'P')){
                    if (tweet.charAt(i+4) == ':'){
                      if (tweet.charAt(i+5) == '/'){
                        if (tweet.charAt(i+6) == '/'){
                          linkc++;}}}}}}}}
        
        System.out.println("Number of Hashtags: " + hashc);
        System.out.println("Number of Attributions: " + atc);
        System.out.println("Number of Links: " + linkc);}
       }
}



     

