package String_operators;

import java.util.Scanner;

public class StringsMethodspractice {
    public static void main(String[] args) {

        System.out.println("Welcome , Please enter your name :");

        // Taking inputs
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        // Converting First letter into uppper case
        String fletter = name.substring(0,1);
        String fletteruppper = fletter.toUpperCase();
        //System.out.println(fletteruppper);

        // Converting rest of the leter into lower case
        String rletter = name.substring(1,5);
        String rletterlower = rletter.toLowerCase();
        //System.out.println(rletterlower);

        // Final result
        System.out.println("Hey there ,"+fletteruppper + rletterlower + " have a nice day!");
    }
}
