package Array_ArrayList;

public class practice4 {
    public static void main(String[] args) {
        int [] arr = {1,200,3,4,5,6};
        int max = 0;

        for (int e:arr) {
            if (e<max) {
                max = e;
            }
        }
        System.out.println("The value of maximum integer is :"+max);

    }
}
