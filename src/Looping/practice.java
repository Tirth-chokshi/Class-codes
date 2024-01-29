package Looping;

public class practice {
    public static void main(String[] args) {
        // Qustion 1
//        int i;
//        int j;
//        for (i=5;i>0;i--) {
//            for (j=0;j<i;j++) {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

        // Qustion 2

//        int sum = 0 ;
//        int n = 3;
//        for (int i =0; i<=n ; i++) {
//            sum = sum + (2*n);
//        }
//        System.out.println("Sum of even numbers is :");
//        System.out.println(sum);

        // Question 4
//        int n = 10;
//        for (int i = 10; i>1; i-- ) {
//            System.out.printf("%d X %d = %d\n",n,i,n*i);
//        }

        // Qustion 9
        int n=8;
        int fact = 1;
        int i;
        int sum = 0;
        for ( i=1; i<=10;i++) {
//            System.out.printf("%d X %d = %d\n",n,i,n*i);
            sum += n*i;
        }
        System.out.println(sum);
    }
}
