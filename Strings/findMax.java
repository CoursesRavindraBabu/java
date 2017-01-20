package Strings;
import java.util.Scanner;
class findMax {
    public static void main(String args[]) {
        String s;
        int max=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        s=sc.next();
        String s1=" ";
        for(int i=0;i<s.length();i++) {
            int count=0;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j))
                    count++;
            }
            if(count>max){
                s1=Character.toString(s.charAt(i));
                max=count;
            } else if(count==max)
                s1=s1+" "+Character.toString(s.charAt(i));
        }
        System.out.println(s1);
    }
    /*
        this is trivial solution, please improve it using hashmaps or by sorting the string.
     */
}