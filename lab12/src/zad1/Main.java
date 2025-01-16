package zad1;

public class Main {
    public static void main(String[] args) {
        Samochod car = new Samochod(new BenzynowySilnik());
        car.start();
        car.stop();

        Samochod car2 = new Samochod(new SilnikDiesel());
        car2.start();
        car2.stop();
    }
}
