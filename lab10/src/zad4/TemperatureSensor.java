package zad4;

public class TemperatureSensor implements Sensor{
    double value;
    String status;

    public TemperatureSensor(double value, String status) {
        this.value = value;
        this.status = status;
    }

    @Override
    public double readValue() {
        return value;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void reset() {
        value = 0;
        status = "zresetowany";
        System.out.println("zresetowano czujnik temperatury");
    }
}
