package ufjf.dcc025.trabalho.model;

import java.time.LocalDate;

/*
  @autores: Ant�nio Marcos Souza Pereira - 202065245A
            Pedro Barbosa Chaves - 202065236A
            Rafaela Fernandes Horta - 202065182A
            Vin�cius de Oliveira Corbelli - 202065093A
 */

public class Investment {
    private static BankAccount bankAccount;
    private static Double initialAmount;
    private static Double currentAmount;
    private static LocalDate date;

    public enum InvestmentType {
        CDB, SELIC, LCI
    }

    public static BankAccount getBankAccount() {
        return bankAccount;
    }

    public static void setBankAccount(BankAccount bankAccount) {
        Investment.bankAccount = bankAccount;
    }

    public static Double getInitialAmount() {
        return initialAmount;
    }

    public static void setInitialAmount(Double initialAmount) {
        Investment.initialAmount = initialAmount;
    }

    public static Double getCurrentAmount() {
        return currentAmount;
    }

    public static void setCurrentAmount(Double currentAmount) {
        Investment.currentAmount = currentAmount;
    }

    public static LocalDate getDate() {
        return date;
    }

    public static void setDate(LocalDate date) {
        Investment.date = date;
    }
}
