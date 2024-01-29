package Array_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListdemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
        // Add elements in list
        list.add(45);
        list.add(45);
        list.add(45);
        list.add(45);
        list.add(45);
        list.add(45);
        list.add(45);
        list.add(45);

        System.out.println(list); // way to print
        // set on index number syntax variable name.set( index_number , new_element)
        list.set(0,99); // adding 99 number element at 0th index
        // same apply for the delete element
        list.remove(2);
        System.out.println(list);
        // iteration input
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        // get iteam at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here , list[index] syntax will not work
        }
        System.out.println(list);
    }
}
