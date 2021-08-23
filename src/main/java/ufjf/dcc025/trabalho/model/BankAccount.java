package ufjf.dcc025.trabalho.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/*
  @autores: Ant�nio Marcos Souza Pereira - 202065245A
            Pedro Barbosa Chaves - 202065236A
            Rafaela Fernandes Horta - 202065182A
            Vin�cius de Oliveira Corbelli - 202065093A
 */

public class BankAccount {
	
    private static User client;
    private static String branch;
    private static String account;
    private static Double statement;

    public BankAccount(User client, Double statement) {
        BankAccount.client = client;
        BankAccount.statement = statement;
    }

    public static User getClient() {
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

    public static BankAccount getBankAcount(User client) {
        String line = new String();
        String fileName = "banckAccount.txt";
        File file = new File(fileName);
        BankAccount bank = new BankAccount(client, 0.0);
        boolean encontrou = false;

        if (file.exists()) {
            try {
                FileReader fileReader = new FileReader(fileName);
                BufferedReader bufferFile = new BufferedReader(fileReader);

                while (true) {
                    line = bufferFile.readLine();
                    if (line == null) {
                        break;
                    }
                    if (line.equals("Email: " + client.getEmail())) {
                        encontrou = true;
                    }
                    if (encontrou == true && line.equals("Branch: ")) {
                        bank.branch = line.substring(8);
                    }
                    if (encontrou == true && line.equals("Account: ")) {
                        bank.account = line.substring(9);
                    }
                    if (encontrou == true && line.equals("Statement: ")) {
                        bank.statement = Double.valueOf(line.substring(11));
                        return bank;
                    }
                }
            } catch (Exception e) {
            }
        }
        if (encontrou == false) {
            store();
        }
        return bank;
    }

    public static void store() {

        Random rand = new Random();
        String branch = "";
        String account = "";

        for (int i = 0; i < 3; i++)
            branch += Integer.toString(rand.nextInt(10) + 0);
        for (int i = 0; i < 6; i++)
            account += Integer.toString(rand.nextInt(10) + 0);
        
        BankAccount.branch = branch;
        BankAccount.account = account;

        try {
            FileWriter file = new FileWriter("banckAccount.txt", true);
            PrintWriter printFile = new PrintWriter(file);

            printFile.println("Email: " + User.getEmail());
            printFile.println("Branch: " + BankAccount.branch);
            printFile.println("Account: " + BankAccount.account);
            printFile.println("Statement: " + BankAccount.statement);
            printFile.println();

            printFile.close();
            file.close();
        } catch (IOException ex) {
        }
    }
}
