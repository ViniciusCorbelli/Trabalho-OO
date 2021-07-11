package ufjf.dcc025.trabalho.model;

/*
  @autores: Antônio Marcos Souza Pereira - 202065245A
            Pedro Barbosa Chaves - 202065236A
            Rafaela Fernandes Horta - 202065182A
            Vinícius de Oliveira Corbelli - 202065093A
 */

public class movement {
    private static bankAccount bankAccount;
    private static MovType type;
    private static Double amount;

    public enum MovType {
        PIX, TRANSFER, DEPOSIT, PAYMENT, DEBIT
    }
}

