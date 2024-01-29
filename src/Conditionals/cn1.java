package Conditionals;
import java.util.Scanner;


public class cn1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String url = sc.next();

        if (url.endsWith(".com")) {
            System.out.println("Comercial Website");
        }
        else if (url.endsWith(".org")) {
            System.out.println("Orgenization Website");
        }
        else if (url.endsWith(".in")) {
            System.out.println("Indian Website");
        }
    }
}
