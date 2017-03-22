package Files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by satheesh on 22/3/17.
 */
/*
Write a java program to check whether the string prefix matches the any one of the prefixes mentioned in the file prefix-urlfilter.txt?

	Note : The format of this file is one URL prefix per line.
		Let File contents are
		http://
		https://
		ftp://
		file://
	Input1:  http://www.example.com/
	Output1: true
	Input2: https://www.example.com/
	Output2: true
       	Input3:  ftp://www.example.com/
	Output3: true
	Input4: file://www.example.com/
	Output4: true
       	Input5 : abcd://www.example.com/
	Output5: false
* */
public class Question2 {

    private static boolean isLineEmpty(String currentLine) {
        return "".equals(currentLine);
    }

    private static ArrayList<String> loadStringsFromFile() {
        ArrayList<String> fileContents = new ArrayList<>();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("/home/satheesh/projects/Java/java/Files/input2.txt"));
            String currentLine = reader.readLine();
            while (currentLine != null) {
                if (!isLineEmpty(currentLine)) {
                    fileContents.add(currentLine);
                    currentLine = reader.readLine();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return fileContents;
    }

    private static boolean isPrefixMatches(String inputLine, ArrayList<String> fileContents) {
        for (String content : fileContents) {
            if (inputLine.startsWith(content)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]){
        ArrayList<String> fileContents = loadStringsFromFile();
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        System.out.println(isPrefixMatches(inputLine, fileContents));
    }
}
