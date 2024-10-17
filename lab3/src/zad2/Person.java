package zad2;

public class Person {
    String firstName;
    String lastName;

    public Person(String firstName, String lastName){
        firstName = firstName;
        lastName = lastName;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Jan","Kowalski");
        System.out.println(p1.firstName);
    }
}
