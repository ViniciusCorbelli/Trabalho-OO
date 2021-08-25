package ufjf.dcc025.trabalho.model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import java.time.LocalDate;

/*
  @autores: Ant�nio Marcos Souza Pereira - 202065245A
            Pedro Barbosa Chaves - 202065236A
            Rafaela Fernandes Horta - 202065182A
            Vin�cius de Oliveira Corbelli - 202065093A
 */
public class Movement {
    private static BankAccount bankAccount;
    private static double value;

    public static BankAccount getBankAccount() {
        return bankAccount;
    }

    public static void setBankAccount(BankAccount bankAccount) {
        Movement.bankAccount = bankAccount;
    }

    public static double getValue() {
        return value;
    }

    public static void setValue(Double value) {
        Movement.value = value;
    }

    // Colocar o método no lugar certo dps
    public static void transfer(BankAccount payer, BankAccount receiver, double value, String type) {
        if (payer.getStatement() < value) { // Remover os 'static' da classe BankAccount
            JOptionPane.showMessageDialog(null, "Você não possui saldo suficiente!");
        } else {
            payer.removeStatement(value);
            receiver.addStatement(value);

            // Extrato de Quem Recebeu
            try {
                FileWriter file = new FileWriter("movements.txt", true);
                PrintWriter printFile = new PrintWriter(file);
                printFile.println("N° da Conta: " + payer.getAccount());
                printFile.println("Valor: " + value);
                printFile.println("Tipo: Enviado " + type);
                printFile.println("Data: " + LocalDate.now());
                printFile.println();
                printFile.println("N° da Conta: " + receiver.getAccount());
                printFile.println("Valor: " + value);
                printFile.println("Tipo: Recebendo " + type);
                printFile.println("Data: " + LocalDate.now());
                printFile.println();
                printFile.close();
                file.close();
            } catch (IOException ex) {
            }
        }
    }

}
