package zad2;

import java.util.ArrayList;
import java.util.Collections;

public class Order implements Comparable<Order>{
    String productName;
    int quantity;
    double unitPrice;

    public Order(String productName, int quantity, double unitPrice) {
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "" +
                productName +
                " " + quantity +
                " " + unitPrice;
    }

    @Override
    public int compareTo(Order o) {
        if(Double.compare(this.unitPrice, o.unitPrice) == 0){
            return Integer.compare(o.quantity, o.quantity);
        }
        return Double.compare(o.unitPrice, this.unitPrice);
    }

    public static void main(String[] args) {
        ArrayList<Order> orders = new ArrayList<>();
        orders.add(new Order("klawiatura",1,199.99));
        orders.add(new Order("myszka",1,29.99));
        orders.add(new Order("hdmi",2,29.99));
        orders.add(new Order("monitor",1,249.99));


        System.out.println(orders);
        Collections.sort(orders);
        System.out.println(orders);
    }
}
