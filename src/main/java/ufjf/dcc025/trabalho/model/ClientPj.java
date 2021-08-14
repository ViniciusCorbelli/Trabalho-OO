package ufjf.dcc025.trabalho.model;

/*
  @autores: Ant�nio Marcos Souza Pereira - 202065245A
            Pedro Barbosa Chaves - 202065236A
            Rafaela Fernandes Horta - 202065182A
            Vin�cius de Oliveira Corbelli - 202065093A
 */
public class ClientPj extends User {

    private static String cnpj;

    public static String getCpnj() {
        return cnpj;
    }

    public static void setCnpj(String cnpj) {
        ClientPj.cnpj = cnpj;
    }

}
