package Polymorphism;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {
    public static void main(String[] args) {
        Shapes  circle = new Circle();
        Shapes square = new Square();
        Shapes shap= new Shapes();

        circle.area();
        square.area();
        shap.area();
    }
}