package zad3;

public class Square {
    int side;

    public Square(int side){
        this.side = side;
    }

    public Square(){
        this(1);
    }

    public static void main(String[] args) {
        Square s1 = new Square(10);
        Square s2 = new Square();
        System.out.println(s1.side);
        System.out.println(s2.side);
    }
}
