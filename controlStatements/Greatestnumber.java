package controlStatements;

import java.util.Scanner;

class Greatestnumber{
    public static void main(){
        Scanner scanner=new Scanner(System.in);
        int a,b,c,largest;
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        if(a>b){
            if(a>c){
                largest=a;
            }else if(b>c){
                largest=b;
            }else {
                largest=c;
            }
        }else if (b>c){
            largest=b;
        }else {
            largest=c;
        }
        System.out.print("The largest number out of given 3 numbers is,"+largest);
    }
}
