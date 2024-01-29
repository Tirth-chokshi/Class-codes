package problem_solving;

import java.io.*;
import java.util.*;

interface AdvanceArithmetic{
    int divisor_sum(int n);
}
class MyCalculator implements AdvanceArithmetic {
    @Override
    public int divisor_sum(int n) {
        int sum = 1;
        for (int i = 1; i <= n / 2; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
    public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        MyCalculator s = new MyCalculator();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(s.divisor_sum(num));
    }
}