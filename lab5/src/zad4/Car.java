package zad4;

public class Car extends Vehicles{
    public int age;
    /*
    //1.
    @Override
    public void drive(){
        System.out.println("The car is moving.");
    }*/
    @Override
    public void drive(){
        super.drive();
        System.out.println(age);
    }
}
