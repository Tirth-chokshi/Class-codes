package interfacedmo;

public class PowerEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Power Engine start");
    }

    @Override
    public void stop() {
        System.out.println("Power Engine stop");
    }

    @Override
    public void accelarate() {
        System.out.println("Power Engine accelarte");
    }
}