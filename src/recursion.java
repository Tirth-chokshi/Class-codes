import java.util.Scanner;

public class recursion {
    static int fact(int n) {
        if (n==0 || n==1) {
            return 1;
        }
        else {
            return n *fact(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to perform factorial :");
        int num = sc.nextInt();
        System.out.println("Factorial of enterd number :"+ fact(num));
    }
}
