package interfacedmo;

public class Car implements Engine,Brake,Media{
    int a=9;

    @Override
    public void brake() {
        System.out.println("braking a car");
    }

    @Override
    public void start() {
        System.out.println("starting the engine");
    }

    @Override
    public void stop() {
        System.out.println("stopping the car");
    }

    @Override
    public void accelarate() {
        System.out.println("pressing acclarate car can move forward");
    }
}
