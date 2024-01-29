package Polymorphism;

import java.lang.annotation.Inherited;

public class Circle extends Shapes{
    @Override // check whether overriding or not
    void area() {
        System.out.println("PI * r * r");
    }
}
