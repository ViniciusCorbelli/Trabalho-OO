package ufjf.dcc025.trabalho.model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.swing.JOptionPane;

/*
  @autores: Ant�nio Marcos Souza Pereira - 202065245A
            Pedro Barbosa Chaves - 202065236A
            Rafaela Fernandes Horta - 202065182A
            Vin�cius de Oliveira Corbelli - 202065093A
 */
public class Movement {

    private BankAccount bankAccount;
    private Double value;
    
    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public double getValue() {
        return this.value;
    }

    public void setValue(Double value) {
    	this.value = value;
    }
    
    public static void transfer(BankAccount payer, double value, String type, boolean receber) {
        if (payer.getStatement() < value) {
            JOptionPane.showMessageDialog(null, "Voc� n�o possui saldo suficiente!");
        } else {
        	if (receber == false)
            payer.removeStatement(value);
        	else
        		payer.addStatement(value);

            // Extrato de Quem Recebeu
            try {
                FileWriter file = new FileWriter("movements.txt", true);
                PrintWriter printFile = new PrintWriter(file);
                printFile.println("N� da Conta: " + payer.getAccount());
                printFile.println("Valor: " + value);
                printFile.println("Tipo: Enviado " + type);
                printFile.println("Data: " + LocalDate.now());
                printFile.println();
                printFile.close();
                file.close();
            } catch (IOException ex) {
            }
        }
    }
    
}
