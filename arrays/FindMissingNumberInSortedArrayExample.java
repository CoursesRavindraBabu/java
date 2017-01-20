package arrays;

public class FindMissingNumberInSortedArrayExample{
    static int array[]={3,5,8,44}; //given array
    
    public static void main(String[] args) {
        displayMissing();
    }

    static public void displayMissing(){
           
       System.out.print("given array(already sorted): ");
       for (int j = 0; j < array.length; j++)
           System.out.print(array[j] +" ");

       System.out.print("\nNumbers missing between 1 to 100 in array :  ");

       for(int i=1,j=0;i<=100;i++){
           if(j<array.length && i==array[j])
                j++;
           else
                System.out.print(i+" ");
       }
       System.out.println();
           
    }
    
}