package zad3;

public class Main {
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "A";
        System.out.println(isEqual(s1, s2));
    }

    public static <T> boolean isEqual(T value1, T value2){
        if(value1 == value2){
            return true;
        }
        else {
            return false;
        }
    }
}
