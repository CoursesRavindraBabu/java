package controlStatements;

import java.util.Scanner;
class GreatestnumberUsingTernaryOperator {
    public static void main(String[] args){
        int a,b,c,largest;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any three numbers: ");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        largest=(a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println("Largest number: "+largest);
    }
}