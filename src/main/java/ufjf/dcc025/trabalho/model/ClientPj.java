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

    public String store() {

        try {
            FileWriter file = new FileWriter("clients.txt", true);
            PrintWriter printFile = new PrintWriter(file);

            printFile.println("Email: " + this.getEmail());
            printFile.println("Tipo: PJ");
            printFile.println("Nome: " + this.getName());
            printFile.println("CNPJ: " + this.getCnpj());
            printFile.println("Ie: " + this.getIe());
            printFile.println("Acesso: " + this.getAccess());
            printFile.println("Senha: " + this.getPassword());
            printFile.println();

            printFile.close();
            file.close();

            return "Cadastrado com sucesso!";

        } catch (IOException ex) {
            return "Erro ao cadastrar!";
        }
    }
}
