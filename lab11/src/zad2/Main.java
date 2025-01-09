package zad2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Counter<Integer> c1 = new Counter<>(lista);
        System.out.println(c1.getCount());
        c1.add(25);
        c1.add(30);
        System.out.println(c1.getCount());
    }
}
