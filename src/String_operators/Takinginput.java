package String_operators;

import java.util.Scanner;

public class Takinginput {
    public static void main(String[] args) {
        System.out.println("Enter 5 subjects marks :");
        Scanner sc = new Scanner(System.in);
        float sub1 = sc.nextInt();
        float sub2 = sc.nextInt();
        float sub3 = sc.nextInt();;
        float sub4 = sc.nextInt();;
        float sub5 = sc.nextInt();;
        float total;
        float percentage;

        total = sub1 + sub2 + sub3 + sub4 + sub5;
        System.out.println("Your total is :"+total);

        percentage = (total/500)*100;
        System.out.println("Your percentages : "+percentage);
    }
}
