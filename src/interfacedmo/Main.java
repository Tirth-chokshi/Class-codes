package interfacedmo;

public class Main {
    public static void main(String[] args) {
//        Engine car = new Car();
//        car.accelarate();
//        car.start();
//        car.stop();
//
//        Media radio = new Car();
//        radio.start();

        NiceCar newCar = new NiceCar();
        newCar.eStart();
        newCar.startMusic();
        newCar.stoptMusic();
        newCar.eStop();

        newCar.upGradeEngine();
        newCar.eStart();
    }
}
