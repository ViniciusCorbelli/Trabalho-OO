package ufjf.dcc025.trabalho.model;

import java.time.LocalDate;

public class Investment {
    private static BankAccount bankAccount;
    private static Double initialAmount;
    private static Double currentAmount;
    private static LocalDate date;

    public enum InvestmentType {
        CDB, SELIC, LCI
    }
}
