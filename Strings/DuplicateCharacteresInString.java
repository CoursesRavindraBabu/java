package Strings;

import java.io.*;
public class DuplicateCharacteresInString {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String repeatedChar=" ";
        for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if(input.indexOf(c,i+1)>0 && repeatedChar.indexOf(c)==-1) {
                    repeatedChar=repeatedChar+c;
                }
        }
            System.out.print(repeatedChar);
    }
    /*
    you improve this answer by using hashmaps or by sorting the string chars, please try those methods
     */
}