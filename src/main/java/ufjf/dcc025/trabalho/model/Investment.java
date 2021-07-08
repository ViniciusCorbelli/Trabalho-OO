package ufjf.dcc025.trabalho.model;

import ufjf.dcc025.trabalho.controller.*;
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
