package ufjf.dcc025.trabalho.model;

public class Movement {
    private static BankAccount bankAccount;
    private static MovType type;
    private static Double amount;

    public enum MovType {
        PIX, TRANSFER, DEPOSIT, PAYMENT, DEBIT
    }
}
