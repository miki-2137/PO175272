package zad4;

public class SensorTest {
    static PressureSensor p1 = new PressureSensor(120.1,"zaciety");
    static TemperatureSensor t1 = new TemperatureSensor(21.5,"dzialajacy");

    public static void main(String[] args) {
        System.out.println(p1.readValue() + " " + p1.getStatus());
        System.out.println(t1.readValue() + " " + t1.getStatus());
        p1.reset();
        t1.reset();
        System.out.println(p1.readValue() + " " + p1.getStatus());
        System.out.println(t1.readValue() + " " + t1.getStatus());
    }
}
