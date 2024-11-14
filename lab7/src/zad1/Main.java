package zad1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static double minimumValue(ArrayList<Double> lista){
        double min = lista.getFirst();
        for(int i = 1; i < lista.size(); i++){
            if(lista.get(i) < min){
                min = lista.get(i);
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Double tab[] = new Double[]{25.4,15.8,12.0,-19.4,0.1,-19.0};
        ArrayList<Double> lista = new ArrayList<>(Arrays.asList(tab));
        System.out.println(minimumValue(lista));
    }
}