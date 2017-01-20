
public class FindLargestSmallestNumber {
        public static int minimum(int i,int j){
                return i>j?j:i;
        }
        public static int maxmimum(int i,int j){
                return i>j?i:j;
        }
        public static void main(String[] args) {
               
            int numbers[] = new int[]{32,43,53,54,32,65,63,98,43,23};

            int smallest = numbers[0];
            int largetst = numbers[0];
               
            for(int i=1; i< numbers.length; i++) {
                largetst=maxmimum(largetst,numbers[i]);
                smallest=minimum(smallest,numbers[i]);
            }
            /*
                You can use Math.min, Math.max for computing minimum and maximum element
             */
            System.out.println("Largest Number is : " + largetst);
            System.out.println("Smallest Number is : " + smallest);
        }
}
 