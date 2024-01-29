package SearchingAlgorithms.LinearSearch;

import java.util.Arrays;

public class _2dArraySearch {
    static int[] search(int[][] arr , int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length;col++){
                if (arr[row][col] == target){
                    return new int[]{row , col};
                }
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int [] [] arr = {
                {31,12,34,62,25},
                {62,27,32,91,50},
        };
        int target = 62;
        int [] ans= search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
}
