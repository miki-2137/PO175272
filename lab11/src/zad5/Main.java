package zad5;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3};
        for(Integer i : array){
            System.out.printf(i + " ");
        }
        System.out.println();
        swap(array, 0, 2);
        for(Integer i : array){
            System.out.printf(i + " ");
        }
    }
    public static <T> void swap(T[] array, int a, int b){
        if(a > array.length || b > array.length){
            System.out.println("indeks spoza zakresu!!!");//IllegalArgumentException
        }
        else{
            T temp = array[a];
            array[a] = array[b];
            array[b] = temp;
        }
    }
}
