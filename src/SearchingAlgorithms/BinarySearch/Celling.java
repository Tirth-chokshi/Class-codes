package SearchingAlgorithms.BinarySearch;

public class Celling {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,12,14,16,18};
        int target = 15;
        int ans = celling(arr, target);
        System.out.println(ans);
    }

    // return the index of smallest no that is greater then target number (>=target)
    static int celling(int[]arr , int target){

        //if the target is greater than th greatest number in the array
        if (target > arr[arr.length -1]){
            return -1;
        }

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
        return start;
    }
}
