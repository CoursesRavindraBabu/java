package Collections.Assignment1;

import java.util.TreeMap;

/**
 * Created by satheesh on 22/3/17.
 */
/*
You are given with unsorted array and an element, find the next highest element than a given element x
 in the input array using TreeMap?
	Example :
			Input : 10, 30, 50, 67, 34, 68
				    x = 67
		    output : 68
* */
public class Question6 {
    public static void main(String[] args) {
        int inputArray[] = {10, 30, 50, 67, 34, 68};
        int x = 67;
        System.out.println(getNextHighestElement(inputArray, x));
    }

    private static int getNextHighestElement(int[] inputArray, int x) {
        TreeMap<Integer, Boolean> integerTreeMap = new TreeMap<>();
        for(int ele : inputArray) {
            integerTreeMap.put(ele, true);
        }
        return integerTreeMap.higherKey(x);
    }
}
