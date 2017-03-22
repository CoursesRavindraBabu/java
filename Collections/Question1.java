package Collections;

import java.io.BufferedReader;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by satheesh on 22/3/17.
 */
/*Consider a set of strings, write a java program to find the number duplicate  using HashSet?
        Example : Input : {"raudra", "ravi", "java", "ravula", "ravi", "ravula"}
        Output : 2*/
public class Question1 {
    private static int countNumberOfDuplicates(String[] inputSet) {
        int countDuplicates = 0;
        HashSet<String> stringHashSet = new HashSet<>();
        for (String inputString : inputSet) {
            if (!stringHashSet.add(inputString)) {
                countDuplicates++;
            }
        }
        return countDuplicates;
    }

    public static void main(String[] args) {
        String[] inputSet =  {"raudra", "ravi", "java", "ravula", "ravi", "ravula"};
        System.out.println(countNumberOfDuplicates(inputSet));
    }
}
