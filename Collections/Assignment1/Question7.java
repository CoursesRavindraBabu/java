package Collections.Assignment1;

import java.util.HashMap;

/**
 * Created by satheesh on 22/3/17.
 */
/*
Given an array A[] and a number x, check for pair in A[] with sum as x using HashMap?
		Example :
			Input : 10, 30, 50, 67, 34, 68
				   x = 60
		    output : 10, 30
		    if no pair found return -1,-1
* */
public class Question7 {
    public static void main(String[] args) {
        int[] inputArray = {10, 30, 50, 67, 34, 68};
        int x = 64;
        int[] output = getPair(inputArray, x);
        System.out.println(output[0] + " " + output[1]);
    }

    private static int[] getPair(int[] inputArray, int x) {
        HashMap<Integer, Boolean> integerHashMap = new HashMap();
        int[] output = new int[] {-1,-1};
        for (int ele : inputArray) {
            integerHashMap.put(ele, true);
        }
        for (int ele : inputArray) {
            if (integerHashMap.get(x - ele) != null) {
                output[0] = ele;
                output[1] = x-ele;
                return output;
            }
        }
        return output;
    }
}
