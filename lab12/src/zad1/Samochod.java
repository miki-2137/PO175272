package zad1;

public class Samochod {
    private Silnik engine;

    public Samochod(Silnik engine) {
        this.engine = engine;
    }

    public void start(){
        engine.uruchom();
    }

    public void stop(){
        engine.zatrzymaj();
    }
}
