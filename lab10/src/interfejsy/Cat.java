package interfejsy;

public class Cat extends Animal implements LoudAnimal{
    public Cat(String name){
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("miau");
    }

    @Override
    public void sayName() {
        System.out.println(name);
    }
}
