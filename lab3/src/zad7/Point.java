package zad7;

public class Point {
    int x;
    int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void distance(Point otherPoint){
        double dx = x - otherPoint.x;
        double dy = y - otherPoint.y;
        double wynik = Math.sqrt((dx * dx) + (dy * dy));
        System.out.println(wynik);
    }

    public static void main(String[] args) {
        Point p1 = new Point(4,0);
        Point p2 = new Point(2,0);
        p1.distance(p2);
    }
}
