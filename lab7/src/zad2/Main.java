package zad2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static int oddElementsSum(ArrayList<Integer> lista){
        int sum = 0;
        for(int i : lista){
            if(i % 2 != 0){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Integer tab[] = new Integer[]{25,15,12,-19,0};
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(tab));
        System.out.println(oddElementsSum(lista));
    }
}
