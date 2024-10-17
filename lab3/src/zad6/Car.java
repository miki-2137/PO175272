package zad6;

public class Car {
    public String brand;
    public String model;
    public int productionYear;

    public Car(String brand, String model, int productionYear){
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
    }

    public Car(String brand, String model){
        this(brand,model,2024);
    }

    public void wyswietl(){
        System.out.println(brand + " " + model + " " + productionYear);
    }

    public static void main(String[] args) {
        Car c1 = new Car("peugeot","206",2003);
        Car c2 = new Car("nissan","micra");
        c1.wyswietl();
        c2.wyswietl();
    }
}
