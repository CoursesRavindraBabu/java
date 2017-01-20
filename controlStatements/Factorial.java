package controlStatements;

import java.util.Scanner;
class Factorial{
    static int fact(int n){
        int p=1;
        for (int i=1;i<n;i++){
            p=p*i;
        }
        return p;
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