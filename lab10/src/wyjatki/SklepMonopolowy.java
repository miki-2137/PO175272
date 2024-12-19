package wyjatki;

public class SklepMonopolowy {
    public static void main(String[] args) {
        /*try{
            checkAge(17);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }*/
        try{
            sprzedajCos();
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    public static void sprzedajCos(){
        checkAge(17);
    }
    public static void checkAge(int age){
        if(age < 18){
            throw new IllegalArgumentException("Niepełnoletni klient!");
        }
    }
}
