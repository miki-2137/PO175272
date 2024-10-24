package zad3;

import java.util.Objects;

public class Person {
    public String firstName;
    public String lastName;
    public int age;

    public Person(String firstName, String lastName, int age){
        if(age < 0){
            this.age = 0;
        }
        this.age = age;
        if(firstName == null || firstName == ""){
            this.firstName = "-";
        }
        this.firstName = firstName;
        if(lastName == null || lastName == ""){
            this.lastName = "-";
        }
        this.lastName = lastName;
    }

    @Override
    public String toString(){
        return "Person: " + firstName + " " + lastName + ", Age: " + age + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return age == person.age && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("","xd",-2);
        Person p2 = new Person("","xd",-5);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p1.equals(p2));
    }
}
