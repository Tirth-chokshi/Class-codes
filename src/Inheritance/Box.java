package Inheritance;

public class Box {
    double h;
    double l;
    double w;

    // static : you can inherit but you cannot override
    // overriding depends on objects static dose not depends on objects ,hence static cannot be overridden
    static void greetings() {
        System.out.println("Box class ");
    }
    Box() {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }
    //Cube
    Box (double side) {
//        super(); // object class
        this.w = side;
        this.l = side;
    }
    Box(double w , double h , double l) {
        this.w = w;
        this.l = l;
        this.h = h;
    }
    Box(Box old) {
        this.h = old.h;
        this.w = old.w;
        this.l = old.l;
    }
    public void  info() {
        System.out.println("Running the box");
    }
}

