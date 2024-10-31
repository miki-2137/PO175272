package zad5;

public class ExtendedCalculator extends Calculator{

    //@Override
    public static int add(int x, int y, int z){
        return x + y + z;
    }

    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(1,2,3));
    }
}
