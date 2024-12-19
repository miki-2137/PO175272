package interfejsy;

import java.util.ArrayList;

public class Butterfly extends Animal{
    public Butterfly(String name) {
        super(name);
    }

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Bonifacy"));
        animals.add(new Dog("Reksio"));
        animals.add(new Butterfly("Paź"));

        for(Animal a : animals){
            if(a instanceof LoudAnimal l){//<==> interfejsy.LoudAnimal l = (interfejsy.LoudAnimal) a (to samo ale szybciej)
                l.makeSound();
                l.sayName();
            }
        }
    }
}
