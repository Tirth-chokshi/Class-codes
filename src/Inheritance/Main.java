package Inheritance;

public class Main {
    public static void main(String[] args) {

        Box box = new Box(4);
//        Box box2 = new Box(box);
//        System.out.println(box.l+" "+ box.w+" "+ box.h);
//
//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(3,4,5,6);
//        System.out.println(box3.h+" "+ box3.weight);

//        Box box5 = new BoxWeight(3,2,5,5);
//        System.out.println(box5);
//        BoxPrice box= new BoxPrice();
        BoxWeight box1 = new BoxWeight();

        box1.greetings();
    }
}
