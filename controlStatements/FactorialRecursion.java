package controlStatements;

import java.util.Scanner;
class FactorialRecursion{
    static int fact(int n){
        int output;
        if(n==1){
            return 1;
        }
        output = fact(n-1)* n;
        return output;
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("Factorial of entered number is: "+fact(num));
    }

   /*
    Works only for integer range, try to make it work for bigger numbers also.
    */
}