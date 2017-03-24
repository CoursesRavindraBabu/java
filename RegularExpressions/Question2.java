package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by satheesh on 22/3/17.
 */
/*
Write a java program to validate the url?
	Input : Url
	Output: true/false
	Note : Url is valis if it starts with either of the following
		http:// [OR]
		http://www.	[OR]
		https:// [OR]
		https://www.
* */
/* Enter "quit" t qui the program*/
public class Question2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();
        while (!url.equals("quit")) {
            System.out.println(isURLValid(url));
            url = scanner.nextLine();
        }
    }

    public static boolean isURLValid(String url) {
        Pattern p = Pattern.compile("http(s?)://(www/.)?.*");
        Matcher match = p.matcher(url);
        return match.matches();
    }
}
