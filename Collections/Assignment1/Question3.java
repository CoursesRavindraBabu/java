package Collections.Assignment1;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by satheesh on 22/3/17.
 */
/*Find the Kth smallest elment from the unsorted arrya using PriorityQueue class?
Example :
			Input : 10, 30, 50, 67, 34, 68
				   k = 3
		    output : 34
* */
public class Question3 {
    public static void main(String[] args) {
        int[] input = {10, 30, 50, 67, 34, 68};
        int k = 3;
        System.out.println(getTheKthLargestEle(input, k));

    }

    private static int getTheKthLargestEle(int[] input, int k) {
        PriorityQueue<Integer> integerPriorityQueue = new PriorityQueue<Integer>();
        if (input.length < k) {
            return -1;
        }
        int kthElement = 0;
        for (int ele : input) {
            integerPriorityQueue.add(ele);
        }
        for (int i = 0; i<k ; i++) {
            kthElement = integerPriorityQueue.poll();
        }
        return kthElement;
    }
}
