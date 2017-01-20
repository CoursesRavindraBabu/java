package controlStatements;

import java.util.Scanner;
 
class ArmstrongNumber
{
   public static void main(String args[])
   {
      int n, sum = 0, temp, remainder, digits;
 
      Scanner in = new Scanner(System.in);
      n = in.nextInt();
 
      digits=1+(int)Math.floor(Math.log10(n));

      temp = n;
 
      while (temp != 0) {
         remainder = temp%10;
         sum +=  Math.pow(remainder,digits);
         temp = temp/10;
      }
 
      if (n == sum)
         System.out.println(n + " is an Armstrong number.");
      else
         System.out.println(n + " is not an Armstrong number.");         
   }

}