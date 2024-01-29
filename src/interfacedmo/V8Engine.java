package interfacedmo;

public class V8Engine implements Engine{

    @Override
    public void start() {
        System.out.println("V8 Engine start");
    }

    @Override
    public void stop() {
        System.out.println("V8 Engine stop");
    }

    @Override
    public void accelarate() {
        System.out.println("V8 Engine accelarte");
    }
}
