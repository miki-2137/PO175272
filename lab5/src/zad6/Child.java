package zad6;

public class Child extends Base{

    public static void info(){
        System.out.println("This is the child class.");
    }

    public static void main(String[] args) {
        Child c1 = new Child();
        Base b1 = new Base();
        c1.info();
        b1.info();
    }
}
