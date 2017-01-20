package controlStatements;
import java.util.Scanner;
class Palindrome {
    public static void main(String[] args) {
        int a,n,temp=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any num: ");
        n=s.nextInt();
        a=n;
        while(n>0){
            temp=temp*10+n%10;
            n=n/10;
        }
        if(temp==a)
            System.out.println("Palindrome");
        else
            System.out.println("not Palindrome");
    }
}