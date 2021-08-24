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

    private static String cnpj;
    private static String Ie;

    public static String getCnpj() {
        return cnpj;
    }

    public static String getIe() {
        return Ie;
    }

    public static void setCnpj(String cnpj) {
        ClientPj.cnpj = cnpj;
    }

    public static void setIe(String Ie) {
        ClientPj.Ie = Ie;
    }
    
    public static String store() {

        try {
            FileWriter file = new FileWriter("clients.txt", true);
            PrintWriter printFile = new PrintWriter(file);

            printFile.println("Email: " + User.getEmail());
            printFile.println("Senha: " + User.getPassword());
            printFile.println("Tipo: PJ");
            printFile.println("Nome: " + User.getName());
            printFile.println("CNPJ: " + ClientPj.getCnpj());
            printFile.println("Ie: " + ClientPj.getIe());
            printFile.println("Acesso: " + User.getAccess());
            printFile.println();

            printFile.close();
            file.close();

            return "Cadastrado com sucesso!";

        } catch (IOException ex) {
            return "Erro ao cadastrar!";
        }
    }

    public static Boolean validateCNPJ(String cnpj){
        if(cnpj.length() != 14) return false;
        else return true;
    }

}
