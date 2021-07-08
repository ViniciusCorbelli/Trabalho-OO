package ufjf.dcc025.trabalho.controller;

public class Movement {
    BankAccount bankAccount;
    MovType type;
    Double amount;

    public enum MovType {
        PIX, TRANSFER, DEPOSIT, PAYMENT, DEBIT
    }
}

