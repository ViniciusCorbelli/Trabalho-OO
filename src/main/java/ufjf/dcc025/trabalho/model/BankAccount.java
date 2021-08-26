package ufjf.dcc025.trabalho.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.swing.JOptionPane;

/*
  @autores: Ant�nio Marcos Souza Pereira - 202065245A
            Pedro Barbosa Chaves - 202065236A
            Rafaela Fernandes Horta - 202065182A
            Vin�cius de Oliveira Corbelli - 202065093A
 */
public class BankAccount {

    private User client;
    private String branch;
    private String account;
    private Double statement;

    public BankAccount(User client, Double statement) {
        this.client = client;
        this.statement = statement;
    }

    public User getClient() {
        return client;
    }

    public String getBranch() {
        return branch;
    }

    public String getAccount() {
        return account;
    }

    public Double getStatement() {
        return statement;
    }

    public void addStatement(Double n) {
        statement += n;
    }

    public void removeStatement(Double n) {
        statement -= n;
    }

    public BankAccount getBankAcount(User client) {
        String line = new String();
        String fileName = "banckAccount.txt";
        File file = new File(fileName);
        BankAccount bank = new BankAccount(client, 0.0);
        this.client = client;
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
                    if (encontrou == true && line.startsWith("Branch: ")) {
                    	this.branch = line.substring(8);
                    }
                    if (encontrou == true && line.startsWith("Account: ")) {
                    	this.account = line.substring(9);
                    }
                    if (encontrou == true && line.startsWith("Statement: ")) {
                    	this.statement = Double.valueOf(line.substring(11));
                        return bank;
                    }
                }
            } catch (Exception e) {
            }
        }
        if (encontrou == false) {
            store(client);
        }
        return bank;
    }

    public void store(User client) {

        Random rand = new Random();
        String branch = "";
        String account = "";

        for (int i = 0; i < 3; i++)
            branch += Integer.toString(rand.nextInt(10) + 0);
        for (int i = 0; i < 6; i++)
            account += Integer.toString(rand.nextInt(10) + 0);
        
        this.branch = branch;
        this.account = account;

        try {
            FileWriter file = new FileWriter("banckAccount.txt", true);
            PrintWriter printFile = new PrintWriter(file);

            printFile.println("Email: " + client.getEmail());
            printFile.println("Branch: " + this.branch);
            printFile.println("Account: " + this.account);
            printFile.println("Statement: " + this.statement);
            printFile.println();

            printFile.close();
            file.close();
        } catch (IOException ex) {
        }
    }
}
