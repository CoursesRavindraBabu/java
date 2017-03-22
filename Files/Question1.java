package Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by satheesh on 22/3/17.
 */
/*
Write a java program to read a file named input1.txt and store each line of a file as string in ArrayList
ignore the lines which are started with # character and empty lines?
	Example: Let file input1.txt contains the following contents:
			aaaaa
			abababa
			#acdef
			cabef
			#a

	Output : ArrayList contains only the following data
			aaaaa
			abababa
			cabef
* */
public class Question1 {

    private static boolean isLineEmpty(String currentLine) {
        return "".equals(currentLine);
    }
    private static boolean isLineToBeConsidered(String line) {
        char x = line.charAt(0);
        return x != '#';
    }

    public static void main(String args[]){
        ArrayList<String> output = new ArrayList<>();
        BufferedReader reader = null;
        try{
            /* Note give the path of file according to your system*/
            reader = new BufferedReader(new FileReader("/home/satheesh/projects/Java/java/Files/input1.txt"));
            String currentLine = reader.readLine();
            while(currentLine != null){
                if (!isLineEmpty(currentLine) && isLineToBeConsidered(currentLine)) {
                    output.add(currentLine);
                }
                currentLine = reader.readLine();
            }

        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println(output);
    }
}
