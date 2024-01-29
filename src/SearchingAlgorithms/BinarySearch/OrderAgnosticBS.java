package SearchingAlgorithms.BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int [] arr = {-7,-6,-5,-3,-2,-1,0,1,2};
        int target = -5;
        int ans = orderAgonstidBS(arr, target);
        System.out.println(ans);
    }
    static int orderAgonstidBS(int[]arr , int target){


    int start = 0;
    int end = arr.length -1 ;

    // find wheterh the array is sorted in ascendiing or descending
        boolean isAsc = arr[start] < arr[end]; // check whether the aray is asc or dec if asc = ture else des = false


        while (start<=end){
        // step 1 - find mid element
        //int mid = (start +end) / 2; // might be possible that (start + end) exceed the range of int in java
        int mid = start + (end - start)/2;

        if (arr[mid] == target){
            return mid;
        }
        if (isAsc){
            if (target < arr[mid]){
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid +1;
            }
        }
        else {
            if (target > arr[mid]){
                end = mid -1;
            } else {
                start = mid +1;
            }
        }
        }
        return -1;
    }
}