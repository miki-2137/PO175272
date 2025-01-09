package zad4;

public class Main {
    public static void main(String[] args) {
        String s1 = "abc";
        int i1 = 123;
        Test t1 = new Test("test");
        Pair<String, Integer> p1 = new Pair<>(s1, i1);
        System.out.println(p1.getFirst());
        System.out.println(p1.getSecond());
        Pair<Test, Integer> p2 = new Pair<>(t1, i1);
        System.out.println(p2.getFirst());
        System.out.println(p2.getSecond());
    }
}
