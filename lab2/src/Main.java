import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listaLiczbCalkowitych = new ArrayList<>();
        for(int i = 3; i <= 12; i++){
            listaLiczbCalkowitych.add(i);
        }
//        for (Integer i : listaLiczbCalkowitych.reversed()) {
//            System.out.print(i + " ");
//        }
//        System.out.println(ListyTablicoweTest.minimumValue(listaLiczbCalkowitych));

        ArrayList<Double> list = new ArrayList<>();
        for(double i = 3.0; i <= 12.0; i++){
            list.add(i);
        }
//        System.out.println(ListyTablicoweTest.average(list));
//        System.out.println(ListyTablicoweTest.countZeros(listaLiczbCalkowitych));
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("wprowadz tekst do odwrocenia: ");
//        String napis = scanner.nextLine();
//        System.out.println(ListyTablicoweTest.odwrocNapis(napis));
//        System.out.println(ListyTablicoweTest.czyTaSama("kajak"));
//        System.out.println(ListyTablicoweTest.zamien("bruv"));
        System.out.println(ListyTablicoweTest.choinka('*',4));
    }
}