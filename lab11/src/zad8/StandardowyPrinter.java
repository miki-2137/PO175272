package zad8;

public class StandardowyPrinter implements Printer{
    String tekst;
    @Override
    public void drukuj() {
        System.out.println(tekst);
    }
}
