package zad4;

import java.util.Objects;

public class Vehicle {
    public String brand;
    public String model;
    public int yearOfProduction;

    public Vehicle(String brand, String model, int yearOfProduction){
        if(yearOfProduction > 2024){
            this.yearOfProduction = 2024;
        }
        if(brand == null || brand.isEmpty()){
            this.brand = "-";
        }
        this.brand = brand;
        if(model == null || model.isEmpty()){
            this.model = "-";
        }
        this.model = model;
    }

    @Override
    public String toString(){
        return "Vehicle: " + brand + " " + model + ", Year: " + yearOfProduction + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle vehicle)) return false;
        return yearOfProduction == vehicle.yearOfProduction && Objects.equals(brand, vehicle.brand) && Objects.equals(model, vehicle.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, yearOfProduction);
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("peugeot","308",2025);
        Vehicle v2 = new Vehicle("peugeot","308",2027);
        System.out.println(v1);
        System.out.println(v1.hashCode() + " " + v2.hashCode());
        System.out.println(v1.equals(v2));
    }
}
