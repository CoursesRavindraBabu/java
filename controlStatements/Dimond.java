package controlStatements;

import java.util.Scanner;
class Dimond {
    public static void printChars(int n,char c){
        for (int i=0;i<n;i++){
            System.out.print(c);
        }
    }
    public static void main(String[] args)
    {
        int n, c, k, space;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        n=s.nextInt();
        space = n - 1;
        for (k = 1; k<=n; k++){
            printChars(space,' ');
            space--;
            printChars(2*k-1,'*');
            System.out.println("");
        }
        space = 1;
        for (k = 1; k<= n - 1; k++){
            printChars(space,' ');
            space++;
            printChars(2*(n-k)-1, '*');
            System.out.println("");
        }
    }
}