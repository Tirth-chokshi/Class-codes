package abstractdemo;

public abstract class Parent {
    int age;

    public Parent(int age) {
        this.age = age;
    }
    static void hello(){
        System.out.println("hey");
    }

    abstract void carrer();
    abstract void partner();
}
