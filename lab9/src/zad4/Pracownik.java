package zad4;

import java.time.LocalDate;
import java.util.Comparator;

public class Pracownik {
    String imie;
    double pensja;
    LocalDate dataZatrudnienia;

    public Pracownik(String imie, double pensja, LocalDate dataZatrudnienia) {
        this.imie = imie;
        this.pensja = pensja;
        this.dataZatrudnienia = dataZatrudnienia;
    }

    @Override
    public String toString() {
        return "" + imie + " " + pensja + " " + dataZatrudnienia;
    }

    public static void main(String[] args) {

    }
}
class PracownikPensjaComparator implements Comparator<Pracownik>{

    @Override
    public int compare(Pracownik o1, Pracownik o2) {
        return Double.compare(o1.pensja, o2.pensja);
    }
}