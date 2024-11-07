package zad4;

public record Car(String brand, String model, int fuelConsumptionPer100km) {

    public double fuelCost(double fuelPrice, double distance){
        double cost = fuelPrice*(distance/100)*fuelConsumptionPer100km;
        return cost;
    }
}
