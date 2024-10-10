import java.util.ArrayList;

public class ListyTablicoweTest {
    public static int minimumValue(ArrayList<Integer> lista){
        int minimum = lista.getFirst();
        for(int i = 1; i < lista.size(); i++){
            if(minimum > lista.get(i)){
                minimum = lista.get(i);
            }
        }
        return minimum;
    }
    public static double average(ArrayList<Double> lista){
        if(lista.isEmpty()) return 0;
        double suma = 0;
        for(Double i : lista){
            suma += i;
        }
        return suma/lista.size();
    }
    public static int countZeros(ArrayList<Integer> lista){
        int ile = 0;
        for(Integer i : lista){
            if(i == 0){
                ile++;
            }
        }
        return ile;
    }
    public static String odwrocNapis(String napis){
//        StringBuilder odwrocony = new StringBuilder();
//        for(int i = napis.length() - 1; i >= 0; i--){
//            odwrocony.append(napis.charAt(i));
//        }
        StringBuilder odwrocony = new StringBuilder(napis);
        return odwrocony.reverse().toString();
    }
    public static boolean czyTaSama(String napis){
        return (napis.charAt(0)==napis.charAt(napis.length()-1));
    }
    public static String zamien(String napis){
        char first = napis.charAt(0);
        char last = napis.charAt(napis.length()-1);
        StringBuilder zmieniony = new StringBuilder();
        zmieniony.append(last);
        for(int i = 1; i <= napis.length()-2; i++){
            zmieniony.append(napis.charAt(i));
        }
        zmieniony.append(first);
        return zmieniony.toString();
//        return napis.charAt(napis.length() - 1) + napis.substring(1, napis.length() - 1) + napis.charAt(0);
    }
    public static String choinka(char znak, int n){
        StringBuilder tree = new StringBuilder();
        String a = "" + znak;
        for(int i = 0; i < n; i++){
            tree.append(znak + a.repeat(i*2)+'\n');
        }
        return tree.toString();
    }
}
