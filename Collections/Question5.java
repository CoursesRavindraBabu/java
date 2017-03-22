package Collections;

import java.util.TreeSet;

/**
 * Created by satheesh on 22/3/17.
 */
/*
Find the sum of k smallest elements in given unsorted array using TreeSet?
		Example : 
			Input : 10, 30, 50, 67, 34, 68
				   k = 3
		    output : 74
* */
public class Question5 {
    public static void main(String[] args) {
        int inputArray[] = {10, 30, 50, 67, 34, 68};
        int k = 3;
        System.out.println(getSumOfKSmallestEle(inputArray, k));
    }

    private static int getSumOfKSmallestEle(int[] inputArray, int k) {
        TreeSet<Integer> integerTreeSet = new TreeSet<>();
        int sum = 0;
        if (k > inputArray.length) {
            return -1;
        }
        for (int ele : inputArray) {
            integerTreeSet.add(ele);
        }
        while(k > 0) {
            sum += integerTreeSet.pollFirst();
            k--;
        }
        return sum;
    }
}
