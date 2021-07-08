package ufjf.dcc025.trabalho.controller;

import java.util.Random;

public class BankAccount {

    private static Client client;
    private static String branch;
    private static String account;
    private static Double statement;

    public BankAccount(Client client, Double statement) {

        Random rand = new Random();
        String branch = null;
        String account = null;
        for (int i = 0; i < 6; i++) {
            branch += Integer.toString(rand.nextInt(10) + 0);
            account += Integer.toString(rand.nextInt(10) + 0);
        }

        BankAccount.client = client;
        BankAccount.branch = branch;
        BankAccount.account = account;
        BankAccount.statement = statement;
    }

    public static Client getClient() {
        return client;
    }

    public static String getBranch() {
        return branch;
    }

    public static String getAccount() {
        return account;
    }

    public static Double getStatement() {
        return statement;
    }

    public static void addStatement(Double n) {
        statement += n;
    }

    public static void removeStatement(Double n) {
        statement -= n;
    }
}
