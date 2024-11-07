package zad6;

public record BankAccount(int nrKonta, double saldo) {
    public BankAccount(int nrKonta){
        this(nrKonta,0);
    }
}
