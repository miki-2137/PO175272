package zad6;

import java.util.Objects;

public class Vehicle {
    String brand;
    String model;
    int yearOfProduction;

    public Vehicle(String brand, String model, int productionYear){
        if(productionYear > 2024){
            this.yearOfProduction = 2024;
        }else this.yearOfProduction = productionYear;
        if(brand.isEmpty() || brand.equals(null)){
            this.brand = "-";
        }else this.brand = brand;
        if(model.isEmpty() || model.equals(null)){
            this.model = "-";
        }else this.model = model;
    }

    @Override
    public String toString() {
        return "Vehicle: " + brand + model +" Year: " + yearOfProduction + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return yearOfProduction == vehicle.yearOfProduction && brand.equals(vehicle.brand) && model.equals(vehicle.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, yearOfProduction);
    }
}
