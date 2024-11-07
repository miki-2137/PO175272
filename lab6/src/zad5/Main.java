package zad5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> oceny = new ArrayList<>();
        oceny.add(5.0);
        oceny.add(4.0);
        oceny.add(4.5);
        Student s1 = new Student("Jan","Kowalski", oceny);
        System.out.println(s1.averageGrades());
    }
}
