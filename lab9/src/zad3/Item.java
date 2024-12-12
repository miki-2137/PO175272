package zad3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Item implements Comparable<Item>{
    String name;
    double weight;
    double price;

    public Item(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " " + weight + " " + price;
    }

    @Override
    public int compareTo(Item o) {
        return Double.compare(this.weight, o.weight);
    }

    public static void main(String[] args) {
        Item[]  items = new Item[4];
        items[0] = new Item("stal",1.0,10.0);
        items[1] = new Item("piora",1.0,20.0);
        items[2] = new Item("kremowki",21.37,21.37);
        items[3] = new Item("cynamonki",0.69,6.9);

        System.out.println(Arrays.toString(items));
        Arrays.sort(items);
        System.out.println(Arrays.toString(items));
    }
}
