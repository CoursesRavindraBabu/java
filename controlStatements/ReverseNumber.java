package controlStatements;

import java.util.Scanner;
class ReverseNumber {
    public static void main(String args[]) {
        int num;
        int reverseNumber =0;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();

        while( num != 0 ) {
            reverseNumber = reverseNumber * 10 + num%10;
            num = num/10;
        }

        System.out.println("Reverse of input number is: "+reverseNumber);
    }
}