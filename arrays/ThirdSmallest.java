package arrays;
import java.util.Arrays;

public class ThirdSmallest
{
	public static void main(String args[]){
		int array[]={1,20,5,6,16,10};
		Arrays.sort(array);
		System.out.println("3rd smallest element is:"+array[2]);
	}

}