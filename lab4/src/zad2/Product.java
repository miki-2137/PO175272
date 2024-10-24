package zad2;

public class Product {
    public static int numberOfProducts;
    public static final int MAX_PRODUCTS = 69;

    public Product(){
        numberOfProducts++;
        if(numberOfProducts > MAX_PRODUCTS){
            System.out.println("za duzo produktow");
            numberOfProducts = MAX_PRODUCTS;
        }
    }

    public static void main(String[] args) {
        for(int i = 0; i < 70; i++){
            Product p = new Product();
        }
    }
}
