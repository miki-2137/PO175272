package zad5;

import java.util.ArrayList;

public record Student(String imie, String nazwisko, ArrayList<Double> oceny) {
    public double averageGrades(){
        double avg = 0;
        for(double i : oceny){
            avg +=i;
        }
        return avg/oceny.size();
    }
}
