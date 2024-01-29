import java.util.Scanner;

class emp1{
    int salary;
    static String name;
    public int getSalary(){
        return salary;
    }
    public String getName() {
        return name;
    }
    public  void setName(String n) {
        name = n;
    }
}

class Cellphone{
    public void ring() {
        System.out.println("Ringing...");
    }
    public void vibrate() {
        System.out.println("Vibrating...");
    }
    public void call() {
        System.out.println("calling...");
    }
}

class Square{
    int side;
    public int area(){
        return side * side;
    }
    public int perimeter() {
        return 4*side;
    }
}
class Rectangle {
    int length;
    int bredth;
    public int area() {
        return length*bredth;
    }
    public int perimeter() {
        return (length+bredth)/2;
    }
}
class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }public void fire(){
        System.out.println("Hitting the firing");
    }public void run(){
        System.out.println("Hitting the running");
    }
}
public class practice_class {
    public static void main(String[] args) {

        /*
        // Problem 1
        emp1 blade = new emp1();

        // Setting values
        blade.setName("Tirth chokshi");
        blade.salary = 555;

        // Calling values by mathods
        System.out.println(blade.getName());
        System.out.println(blade.getSalary());

        // Problem 2

        Cellphone samsung = new Cellphone();

        samsung.call();
        samsung.vibrate();
        samsung.ring();
         */

        // Problem 3
//        Square sq = new Square();
//        sq.side = 3;
//        System.out.println(sq.area());
//        System.out.println(sq.perimeter());

        // Problem 4
//        Rectangle rec = new Rectangle();
//        rec.length = 4;
//        rec.bredth = 5;
//
//        System.out.println(rec.area());
//        System.out.println(rec.perimeter());

        // Problem 5
//        Tommy vercetti = new Tommy();
//        vercetti.hit();
//        vercetti.fire();
//        vercetti.run();
    }
}