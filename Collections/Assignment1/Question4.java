package Collections.Assignment1;

/**
 * Created by satheesh on 22/3/17.
 */
/*
Correction to the question : You do not need to use the binarySearch() function, if you use it will increase the
Time complexity
Count number of 1's in binary sorted array using binarySearch?
Example :
			Input : 0, 0, 0 , 1, 1, 1, 1, 1
		    output : 5
* */
public class Question4 {

    public static void main(String[] args) {
        int[] input = {0, 0, 0 , 1, 1, 1, 1, 1};
        System.out.println(countNumberOfOnes(input));
    }

    private static int countNumberOfOnes(int[] input) {
        int mid = 0, low = 0, high = input.length;
        while(low != high) {
            mid = (low + high)/2;
            if (input[mid] == 0) {
                low = mid + 1;
            } else {
                high = mid -1;
            }
        }
        return input[low] ==0 ? input.length - (low+1) : input.length - low;
    }
}
