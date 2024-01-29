package Array_ArrayList;

import java.util.Scanner;
public class practice1{
    public static void main(String[] args) {

//         Problem 2
        Scanner sc = new Scanner(System.in);
        float []marks={46.5f,67.9f,86.4f,94.5f,100.0f};
        System.out.println("Enter the number :");

        // This section take input form user and save it in "num" variable
        float num = sc.nextFloat();

        // This variable checks whether the number entered in is true or false.
        //this statmetn alredy says that number is wrong = "false".
        boolean isArray = false;

        // the loop will check the elements of array.
        for (float element:marks) {
            // if enterd num is present in array then value is true.
            if (num == element) {
                isArray = true;
                break;
            }
        }
        // if value is true this statement will execute
        if (isArray) {
            System.out.println("Number is present in array!");
        }
        // if number is wrong enterd then this statment will execute
        else {
            System.out.println("Number is not present in the array!");
        }
    }
}