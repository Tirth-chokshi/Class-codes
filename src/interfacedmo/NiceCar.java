package interfacedmo;

public class NiceCar {
    private Engine engine;
    private Media player = new CDplayer();

    public NiceCar() {
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void eStart() {
        engine.start();
    }

    public void eStop() {
        engine.stop();
    }

    public void startMusic() {
        player.start();
    }

    public void stoptMusic() {
        player.stop();
    }

    public void upGradeEngine(){ this.engine = new V8Engine(); }
}