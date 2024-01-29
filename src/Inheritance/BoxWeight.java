package Inheritance;

public class BoxWeight extends Box{
    double weight;
    public BoxWeight(){
        this.weight = -4;
    }

    static void greetings(){
        System.out.println("Boxweight class");
    }
    BoxWeight (BoxWeight other) {
        super(other);
        weight = other.weight;
    }
    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }
    public BoxWeight(double w, double h, double l, double weight) {
        super(w, h, l); // CaLL the parent class constructor
        // used to intiallize values present in parent class
//        super.weight // if parent class and child class both have same variable then if you want to access variable
//        that is in parent class then use super keyword , this keyword refer to present class variable
        this.weight = weight;
    }
}
