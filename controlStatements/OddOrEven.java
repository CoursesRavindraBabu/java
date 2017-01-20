package controlStatements;

import java.util.Scanner;
 
class OddOrEven {
    public static void main(String args[]) {
        int number;
        System.out.println("Enter an integer to check if it is odd or even ");
        Scanner in = new Scanner(System.in);
        number = in.nextInt();
        if ( number % 2 == 0 )
           System.out.println("You entered an even number.");
        else
            System.out.println("You entered an odd number.");
    }
}