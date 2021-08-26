package ufjf.dcc025.trabalho.model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.swing.JOptionPane;

/*
  @autores: Antï¿½nio Marcos Souza Pereira - 202065245A
            Pedro Barbosa Chaves - 202065236A
            Rafaela Fernandes Horta - 202065182A
            Vinï¿½cius de Oliveira Corbelli - 202065093A
 */
public abstract class Movement {

	private Double value;

	public double getValue() {
		return this.value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public String transfer(BankAccount payer, double value, String type, boolean receber) {
		if (receber == false && payer.getStatement() < value) {
			return "Você não possui saldo suficiente!";
		} else {
			if (receber == false)
				payer.removeStatement(value);
			else
				payer.addStatement(value);

			// Extrato de Quem Recebeu
			try {
				FileWriter file = new FileWriter("movements.txt", true);
				PrintWriter printFile = new PrintWriter(file);
				printFile.println("N° da Conta: " + payer.getAccount());
				printFile.println("Valor: " + value);
				printFile.println("Tipo: " + type);
				printFile.println("Data: " + LocalDate.now());
				printFile.println();
				printFile.close();
				file.close();

				return "Movimentação realizada com sucesso!";
			} catch (IOException ex) {
			}
		}
		return "Ocorreu um erro!";
	}

	public abstract void setBankAccount(BankAccount bank);

}
