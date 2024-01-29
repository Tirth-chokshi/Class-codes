package Array_ArrayList;

public class max {
    static  int max(int[] arr) {
        int maxval = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }
    public static void main(String[] args) {
        int [] arr ={1,22, 42,12,53};
         System.out.println(max(arr));
    }
}