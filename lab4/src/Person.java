import java.util.Objects;

public class Person {
    public String imie;
    public String nazwisko;
    public double ocena;
    public static String nazwaUczelni = "UWM";

    public Person(String imie, String nazwisko, double ocena) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.ocena = ocena;
    }

    /*public String przedstawSie(){
        return "Nazywam się " + imie + " " + nazwisko + ", studiuję na " + nazwaUczelni;
    }*/

    /*public String toString(){
        return "Nazywam się " + imie + " " + nazwisko + ", studiuję na " + nazwaUczelni;
    }*/

    /*public boolean equals(Object o){ //napisane recznie
        if(o instanceof Person other){
            if(this.imie.equals(other.imie) && this.nazwisko.equals(other.nazwisko)){
                return true;
            }
        }
        return false;
    }

    public int hashCode(){
        return Objects.hash(imie, nazwisko);
    }*/

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return Double.compare(person.ocena, ocena) == 0 && Objects.equals(imie, person.imie) && Objects.equals(nazwisko, person.nazwisko);
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Double.compare(ocena, person.ocena) == 0 && Objects.equals(imie, person.imie) && Objects.equals(nazwisko, person.nazwisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, ocena);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Adam", "Kowalski", 3);
        Person p2 = new Person("Janina", "Kozłowska", 4);
        /*System.out.println(p1.przedstawSie());
        System.out.println(p1.imie + " " + p1.nazwisko + " " + Person.nazwaUczelni);
        Person.nazwaUczelni = "ART";
        System.out.println(p1.przedstawSie());
        System.out.println(p2.przedstawSie());
        System.out.println(p1.toString());*/
        Person p3 = new Person("Janina", "Kozłowska", 4);
        System.out.println(p2.equals(p3));
        System.out.println(p2.hashCode() + " " + p3.hashCode());
    }
}
