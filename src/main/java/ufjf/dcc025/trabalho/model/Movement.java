package ufjf.dcc025.trabalho.model;

public class movement {
    private static bankAccount bankAccount;
    private static MovType type;
    private static Double amount;

    public enum MovType {
        PIX, TRANSFER, DEPOSIT, PAYMENT, DEBIT
    }
}

