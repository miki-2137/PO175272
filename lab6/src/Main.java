public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Adam",3);
        System.out.println(p1.imie() + " " + p1.wiek());
        Person p2 = new Person("Stefan");
        Person p3 = new Person("Adam",3);
        System.out.println(p2);
        System.out.println(p3.equals(p1));
        p1.przedstawSie();
    }
}