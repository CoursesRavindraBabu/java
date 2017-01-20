package controlStatements;

import java.util.Scanner;
 
class SwapNumbersWithOutThirdVariable
{
   public static void main(String args[])
   {
      int x, y;
      System.out.println("Enter x and y");
      Scanner in = new Scanner(System.in);
 
      x = in.nextInt();
      y = in.nextInt();
 
      System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
 
      x = x + y;
      y = x - y;
      x = x - y;
 
      System.out.println("After Swapping\nx = "+x+"\ny = "+y);
   }
}