package Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by satheesh on 22/3/17.
 */
/*
Write a java program to read any .java file and remove comments in it?
* */
public class Question3 {

    public static void main( String a[] ) {
        String source = readFile("/home/satheesh/projects/Java/java/Files/Question1.java");
        System.out.println(source.replaceAll("(?:/\\*(?:[^*]|(?:\\*+[^*/]))*\\*+/)|(?://.*)",""));

    }


    static String readFile(String fileName) {
        File file = new File(fileName);
        char[] buffer = null;
        try {
            BufferedReader bufferedReader = new BufferedReader( new FileReader(file));
            buffer = new char[(int)file.length()];
            int i = 0;
            int c = bufferedReader.read();
            while (c != -1) {
                buffer[i++] = (char)c;
                c = bufferedReader.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return new String(buffer);
    }
}
