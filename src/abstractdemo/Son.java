package abstractdemo;

public class Son extends Parent{

    public Son(int age) {
       super(age);
    }

    @Override
    void carrer() {
        System.out.println("be doctor");
    }

    @Override
    void partner() {
        System.out.println("love minds");
    }
}
