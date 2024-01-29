package abstractdemo;

public class Daughter extends Parent {

    public Daughter(int age) {
        super(age);
    }

    @Override
    void carrer() {
        System.out.println("be coder");
    }

    @Override
    void partner() {
        System.out.println("love coding");
    }
}
