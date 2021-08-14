package ufjf.dcc025.trabalho.model;

/*
  @autores: Ant�nio Marcos Souza Pereira - 202065245A
            Pedro Barbosa Chaves - 202065236A
            Rafaela Fernandes Horta - 202065182A
            Vin�cius de Oliveira Corbelli - 202065093A
 */
public class ClientPf extends User {

    private static String cpf;
    private static String rg;
    private static Address address;

    public static String getCpf() {
        return cpf;
    }

    public static String getRg() {
        return rg;
    }

    public static Address getAddress() {
        return address;
    }

    public static void setCpf(String cpf) {
        ClientPf.cpf = cpf;
    }

    public static void setRg(String rg) {
        ClientPf.rg = rg;
    }

    public static void setAddress(Address address) {
        ClientPf.address = address;
    }

}
