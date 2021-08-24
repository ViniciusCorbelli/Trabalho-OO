package ufjf.dcc025.trabalho.model;

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
}
