package zad3;

public record PointR(double x, double y) {

    public PointC ToClass(){
        return new PointC(x, y);
    }
}
