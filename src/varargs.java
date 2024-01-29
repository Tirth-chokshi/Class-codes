public class varargs {
    // Unlimited Variable
    static int sum(int x,int ...arr) {
        int result = x;
        for (int a:arr) {

            result +=a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 4 nad 5 "+sum(1));
    }
}
