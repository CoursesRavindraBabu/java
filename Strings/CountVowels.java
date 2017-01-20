package Strings;

import java.lang.String;
import java.io.*;
import java.util.*;

public class CountVowels{
    public static void main(String args[])throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String text = bf.readLine();
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
                count++;
            }
        }
        System.out.println("There are" + " " + count + " " + "vowels");
    }
} 