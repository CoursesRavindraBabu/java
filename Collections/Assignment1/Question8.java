package Collections.Assignment1;

import java.util.HashMap;

/**
 * Created by satheesh on 22/3/17.
 */
/*
Find the maximum occuring character in the given input string using HashMap?
Example :
			Input :"javalanguage"
		    output : a
* */
public class Question8 {

    public static void main(String[] args) {
        String inputString = "javalanguage";
        System.out.println(getMaxOccuringCharacter(inputString));
    }

    private static char getMaxOccuringCharacter(String inputString) {
        int count, maxCount = 0;
        char maxOccChar = 0;
        HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();
        for (int i = 0; i < inputString.length(); i++) {
            if (characterIntegerHashMap.get(inputString.charAt(i)) == null) {
                count = 1;
                characterIntegerHashMap.put(inputString.charAt(i), count);
            }
            else {
                count = characterIntegerHashMap.get(inputString.charAt(i));
                characterIntegerHashMap.put(inputString.charAt(i), ++count);
            }
            if (count > maxCount) {
                maxOccChar = inputString.charAt(i);
                maxCount = count;
            }
        }
        return maxOccChar;
    }
}
