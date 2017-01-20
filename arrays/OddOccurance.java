package arrays;

class OddOccurance{

    int getOddOccurrence(int array[]) {
        int res = 0;
        for (int i = 0; i < array.length; i++){
            res = res ^ array[i];
        }
        return res;
    }
 
    public static void main(String[] args) {
        OddOccurance occur = new OddOccurance();
        int array[] = new int[]{2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
        System.out.println(occur.getOddOccurrence(array));
    }

}