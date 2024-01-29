package methods;
import java.util.Scanner;
public class practice_methods {
    static void table(int n) {
        for (int i =1; i<=10;i++) {
            System.out.format(" %d X %d = %d\n",n,i,n*i);
        }
    }
    static void pattern(int n) {
        for (int i=0;i<=n;i++) {
            for (int j=1;j<=i;j++){
                System.out.printf("* ");
            }
            System.out.println();
        }
    }
    static void patternRev(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i+1); j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static int sumRec(int n) {
        if (n==1) {
            return 1;
        }
        else {
            return n + sumRec(n-1);
        }
    }
    static int fib(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fib(n-1) + fib(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // Question 1 - multiplication table
//        System.out.print("Enter number to print that number's table :");
//        table(sc.nextByte());

        // Question 2 - pattern
//        System.out.print("Enter number to rows to print patttern :");
//        pattern(sc.nextByte());

        // Question 3 - sum of fist n natural numbers
//        int c = sumRec(8);
//        System.out.println(c);

        // Question 4 - Reverse pattern
//                patternRev(sc.nextByte());

        // Question 5 - fibonacci series
        // 0,1,1,2,3,5,8,13,21,34
//        int x= fib(5);
//        System.out.println(x);
    }
}
