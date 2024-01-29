package SearchingAlgorithms.BinarySearch;

public class B_Search {
    public static void main(String[] args) {
        int [] arr = {-7,-6,-5,-3,-2,-1,0,1,2,3,4,5,6,7,8};
        int target = -7;
        int ans = binarysearch(arr, target);
        System.out.println(ans);
    }

    static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1 ;
        while (start<=end){
            // step 1 - find mid element
            //int mid = (start +end) / 2; // might be possible that (start + end) exceed the range of int in java
            int mid = start + (end - start)/2;

            if (target < arr[mid]){
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid +1;
            }
            else {
                // ans found
                return  mid;
            }
        }
        return -1;
    }

}
