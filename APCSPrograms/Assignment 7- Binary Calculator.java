/* Assignment 7- Binary Calculator
 * Input 2 numbers in base 10
 * Store the binary of each in an array
 * Store the sum of them in binary form in an array
 * Return the sum in binary form
 */

import java.util.Scanner;
import java.lang.Math;
class Main{
  public static int[] convertToBinary(int num){
    int[] powof2 = {128, 64, 32, 16, 8, 4, 2, 1};
    int[] list = new int[8];
    if (num <= 255){
      while (num > 0){
        for (int i = 0; i < 8; i++){
          //if it's less than the num
          if (powof2[i] <= num){
            //set list value to 1
            list[i] = 1;
            //subtract it from the num
            num -= powof2[i];
          }
          else{
            list[i] = 0;
          }
        }
      }
      for (int i = 0; i < 8; i++){
        System.out.print(list[i] + " ");}}
      return list;
    }

    
  
  public static int[] addBin(int a, int b){
    int sum = a+b;
    return convertToBinary(sum);}
    
  public static void main(String[] args){
    Scanner scan = new Scanner (System.in);
    System.out.println("Enter a base ten number between 0 and 255, inclusive.");
    int num1 = scan.nextInt();
    System.out.println("Enter a base ten number between 0 and 255, inclusive.");
    int num2 = scan.nextInt();
    
    System.out.println("First binary number:");
    convertToBinary(num1); 
    
    System.out.print("\n \n");
    System.out.println("Second binary number:");
    convertToBinary(num2);
    
    if (num1+num2 <= 255){
      System.out.print("\n \n");
      System.out.println("Added:");
      addBin(num1,num2);}
    
    System.out.print(21.0/5);
    }
  }

    