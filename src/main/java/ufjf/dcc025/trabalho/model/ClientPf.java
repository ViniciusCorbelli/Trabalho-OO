package ufjf.dcc025.trabalho.model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

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
    private static String birthDate;

    public static String getCpf() {
        return cpf;
    }

    public static String getRg() {
        return rg;
    }

    public static Address getAddress() {
        return address;
    }

    public static String getBirthDate() {
        return birthDate;
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

    public static void setBirthDate(String birthDate) {
        ClientPf.birthDate = birthDate;
    }

    public static String store() {

        try {
            FileWriter file = new FileWriter("clients.txt", true);
            PrintWriter printFile = new PrintWriter(file);

            printFile.println("Email: " + User.getEmail());
            printFile.println("Senha: " + User.getPassword());
            printFile.println("Tipo: PF");
            printFile.println("Nome: " + User.getName());
            printFile.println("CPF: " + ClientPf.getCpf());
            printFile.println("RG: " + ClientPf.getRg());
            printFile.println("DataNascimento: " + ClientPf.getBirthDate());
            printFile.println("Rua: " + Address.getStreet());
            printFile.println("Numero: " + Address.getNumber());
            printFile.println("CEP: " + Address.getZipcode());
            printFile.println("Cidade: " + Address.getCity());
            printFile.println("Estado: " + Address.getState());
            printFile.println("Acesso: " + User.getAccess());
            printFile.println();

            printFile.close();
            file.close();

            return "Cadastrado com sucesso!";

        } catch (IOException ex) {
            return "Erro ao cadastrar!";
        }
    }

}
