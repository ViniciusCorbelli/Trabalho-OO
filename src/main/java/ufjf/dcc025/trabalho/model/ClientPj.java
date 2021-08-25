package ufjf.dcc025.trabalho.model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
  @autores: Ant�nio Marcos Souza Pereira - 202065245A
            Pedro Barbosa Chaves - 202065236A
            Rafaela Fernandes Horta - 202065182A
            Vin�cius de Oliveira Corbelli - 202065093A
 */
public class ClientPj extends User {

    private String cnpj;
    private String Ie;

    public String getCnpj() {
        return cnpj;
    }

    public String getIe() {
        return Ie;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setIe(String Ie) {
        this.Ie = Ie;
    }

    public static String store(User user) {

        try {
            FileWriter file = new FileWriter("clients.txt", true);
            PrintWriter printFile = new PrintWriter(file);

            printFile.println("Email: " + user.getEmail());
            printFile.println("Tipo: PJ");
            printFile.println("Nome: " + user.getName());
            printFile.println("CNPJ: " + ClientPj.getCnpj());
            printFile.println("Ie: " + ClientPj.getIe());
            printFile.println("Acesso: " + user.getAccess());
            printFile.println("Senha: " + user.getPassword());
            printFile.println();

            printFile.close();
            file.close();

            return "Cadastrado com sucesso!";

        } catch (IOException ex) {
            return "Erro ao cadastrar!";
        }
    }

}
