package ufjf.dcc025.trabalho.controller;

import java.time.LocalDate;

public class Investment {
    BankAccount bankAccount;
    Double initialAmount;
    Double currentAmount;
    LocalDate date;

    public enum InvestmentType {
        CDB, SELIC, LCI
    }
}
