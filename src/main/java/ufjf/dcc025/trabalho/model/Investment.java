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
}
