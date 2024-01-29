package abstractdemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(5);
        Daughter dau = new Daughter(10);
        son.carrer();
        dau.carrer();
        System.out.println(son.age);
        Parent.hello();
    }
}
