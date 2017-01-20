package arrays;
// Recursive Java Program to reverse an array
import java.io.*;
 
class ReverseArray {

    public static void swap(int array[],int i, int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
    static void rvereseArray(int array[], int start, int end){
        if (start >= end)
            return;
        swap(array,start,end);
        rvereseArray(array, start+1, end-1);
    }
 

    static void printArray(int array[]){
        for (int i=0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println("");
    }

    public static void main (String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6};
        printArray(array);
        rvereseArray(array, 0, array.length-1);
        System.out.println("Reversed array is :");
        printArray(array);
    }
}