package zad1;

import java.beans.Introspector;

public class Main {
    public static void main(String[] args) {
        Triple<Integer, Double, String> t1 = new Triple<>(2, 1.3, "siedem");
        System.out.println(t1.getFirst());
        System.out.println(t1.getSecond());
        System.out.println(t1.getThird());
    }
}
