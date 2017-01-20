package Strings;
import java.util.*;
public class ReverseWords {
    public static void main(String[] args) {
        System.out.print("Enter the string: ");
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        StringBuffer buffer = new StringBuffer(str);
        StringTokenizer st = new StringTokenizer(buffer.reverse().toString(), " ");
        System.out.print("Reversed Words: ");
        while(st.hasMoreTokens()){
            StringBuffer sb= new StringBuffer(st.nextToken());
            System.out.print(" "+sb.reverse());
        }
    }
}