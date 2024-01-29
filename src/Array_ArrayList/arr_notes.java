package Array_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class arr_notes {
    public static void main(String[] args) {
        /* primitivie datatypes stored in stack memroy
        primitive data type is something that we cannot broken  down
        we can broke down strings can be borken down to char , arrays can be broke down into individuals elements
         object and other type are stored in heap memory ex- String , array obj , arraylist */
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;

        for (int num : arr) { // Here num is representing element of the array
            System.out.println(num + " ");
        }

        System.out.println(Arrays.toString(arr)); // converts all the array elements into string


        String [] arr2 =  new String[4];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.next();
        }

        System.out.println(Arrays.toString(arr2));
    }
}

