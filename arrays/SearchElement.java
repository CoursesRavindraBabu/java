package arrays;

public class SearchElement {
   public static void main(String[] args) {
      int[] a = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
      int target = 0;
      
      for (int i = 0; i < a.length; i++) {
         if (a[i] == target) {
            System.out.println("Element found at index " + i);
            break;
         } 
      } 
   }
   /*
        please use binary search to improve its performance. these programs programs are provided to you make familiar with java
    */
}