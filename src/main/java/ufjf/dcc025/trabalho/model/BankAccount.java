package ufjf.dcc025.trabalho.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
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
		String fileName = "bankAccount.txt";
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

	public boolean hasBankAccount(String branch, String account) {
		String line = new String();
		String fileName = "bankAccount.txt";
		File file = new File(fileName);
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
					if (line.equals("Branch: " + branch)) {
						encontrou = true;
					}
					if (encontrou == true && line.equals("Account: " + account)) {
						return true;
					}
				}
			} catch (Exception e) {
			}
		}
		return false;
	}

	public BankAccount getBankAccount(String branch, String account) {
		String line = new String();
		String fileName = "bankAccount.txt";
		File file = new File(fileName);
		boolean encontrou = false;
		BankAccount bank = new BankAccount(client, 0.0);
		bank.branch = branch;
		bank.account = account;

		if (file.exists()) {
			try {
				FileReader fileReader = new FileReader(fileName);
				BufferedReader bufferFile = new BufferedReader(fileReader);

				while (true) {
					line = bufferFile.readLine();
					if (line == null) {
						break;
					}
					if (line.equals("Branch: " + branch)) {
						encontrou = true;
					}
					if (encontrou == true && line.startsWith("Statement: ")) {
						bank.statement = Double.parseDouble(line.substring(11));
					}
				}
			} catch (Exception e) {
			}
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
		this.statement = 0.0;

		try {
			FileWriter file = new FileWriter("bankAccount.txt", true);
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

	public void updateFile() {

		List<String> linhas = new ArrayList<>();
		String line = new String();
		String fileName = "bankAccount.txt";
		File file = new File(fileName);
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
					linhas.add(line);
				}
			} catch (Exception e) {
			}
		}

		try {
			FileWriter fileEscrever = new FileWriter(fileName);
			PrintWriter printFile = new PrintWriter(file);

			for (String linha : linhas) {
				if (linha.equals("Account: " + this.account)) {
					printFile.println(linha);
					encontrou = true;
				} else if (encontrou == true) {
					printFile.println("Statement: " + this.statement);
					encontrou = false;
				} else {
					printFile.println(linha);
				}
			}

			printFile.close();
			fileEscrever.close();
		} catch (IOException ex) {
		}
	}
}
