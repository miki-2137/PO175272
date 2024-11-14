package zad5;

public class Car {
    String brand;
    String model;
    int productionYear;

    public Car(String brand, String model, int productionYear){
        if(productionYear > 2024){
            this.productionYear = 2024;
        }else this.productionYear = productionYear;
        if(brand.isEmpty() || brand.equals(null)){
            this.brand = "-";
        }else this.brand = brand;
        if(model.isEmpty() || model.equals(null)){
            this.model = "-";
        }else this.model = model;
    }

}
