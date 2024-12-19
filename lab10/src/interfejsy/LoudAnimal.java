package interfejsy;

public interface LoudAnimal {
    final static int tysiac = 1000;//zawsze final i static
    void makeSound();

    default void sayName(){//nieabstrakcyjna
        System.out.println("nie wiem jak sie nazywam");
    }
}
