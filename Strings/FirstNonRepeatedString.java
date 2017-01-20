package Strings;

import java.util.Scanner;
public class FirstNonRepeatedString {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String");
        String input = in.nextLine();
        char process[] = input.toCharArray();
        boolean status = false;
        int index = 0;
        for (int i = 0; i < process.length; i++) {
            for (int j = i+1; j < process.length; j++) {
                if (process[i] == process[j]) {
                    status = false;
                    break;
                } else {
                    status = true;
                    index = i;
                }
            }
            if (status) {
                System.out.println("First non-repeated string is : " + process[index] + " INDEX " + index);
                break;
            }
        }
    }
    /*
        Similarly like other problems you can improve this algorithm, when you learn hash maps you will get idea how to do this
     */
}