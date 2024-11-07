package zad3;

public class PointC {
    public double x;
    public double y;

    public PointC(double x, double y){
        this.x = x;
        this.y = y;
    }
    public PointR ToRecord(){
        return new PointR(x, y);
    }
}
