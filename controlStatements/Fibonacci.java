package controlStatements;
import java.util.Scanner;
class Fibonacci {
    public static void main(String[] args) {
        int i,no, first=0, second=1, next;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of terms for Series: ");
        no=s.nextInt();
        System.out.println("Fibonacci series are: ");
        for(i=0; i<no; i++) {
            System.out.println(first);
            next = first + second;
            first = second;
            second = next;
        }
    }
}