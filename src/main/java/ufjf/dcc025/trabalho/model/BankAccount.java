package ufjf.dcc025.trabalho.model;

import java.util.Random;

public class bankAccount {

    private static client client;
    private static String branch;
    private static String account;
    private static Double statement;

    public bankAccount(client client, Double statement) {

        Random rand = new Random();
        String branch = null;
        String account = null;
        for (int i = 0; i < 6; i++) {
            branch += Integer.toString(rand.nextInt(10) + 0);
            account += Integer.toString(rand.nextInt(10) + 0);
        }

        bankAccount.client = client;
        bankAccount.branch = branch;
        bankAccount.account = account;
        bankAccount.statement = statement;
    }

    public static client getClient() {
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
