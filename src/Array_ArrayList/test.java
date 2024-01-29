package Array_ArrayList;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class test {
    public int[] getConcatination(int[]nums){
        int [] ans = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i+ nums.length] = nums[i];
        }
        return ans;
    }
    static void swap(int[]arr , int index1 , int index2){
        int temp = arr[index1];
        arr[index2] = arr[index1];
        arr[index2] = temp;
    }
    static void reverse(int [] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start<end){
            swap(arr,start,end);
            start++;
            end++;
        }

    }
    public int [] runningSum(int[] arr){
        int [] sum = new int[arr.length];
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            temp = temp + arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = {1,43,25,12,45};

//        You can solve this problem by iterating through the accounts array and summing the wealth of each customer.
//        You can then compare each customer's wealth to a variable that keeps track of the maximum wealth, updating
//        the maximum wealth if a customer's wealth is greater than the current maximum.

//        swap(arr , 1, 3);
//        System.out.println(Arrays.toString(arr));
//        reverse(arr);
//        System.out.println(Arrays.toString(arr));
    }
}
