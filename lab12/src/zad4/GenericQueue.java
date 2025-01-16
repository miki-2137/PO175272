package zad4;

import java.util.ArrayList;

public class GenericQueue<T> {
    private final ArrayList<T> value;

    public GenericQueue(){
        value = new ArrayList<>();
    }

    public void enqueue(T element){
        value.add(element);
    }

    public T dequeue(){
        T t = value.getFirst();
        value.removeFirst();
        return t;
    }

    public static void main(String[] args) {
        GenericQueue<Integer> g1 = new GenericQueue<>();
        g1.enqueue(2);
        g1.enqueue(13);
        g1.enqueue(7);
        System.out.println(g1.dequeue());
        System.out.println(g1.dequeue());
        System.out.println(g1.dequeue());
        System.out.println(g1.dequeue());
    }
}
