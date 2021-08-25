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

    private String cpf;
    private String rg;
    private Address address;
    private String birthDate;

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public Address getAddress() {
        return address;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String store(User client, Address address) {

        try {
            FileWriter file = new FileWriter("clients.txt", true);
            PrintWriter printFile = new PrintWriter(file);

            printFile.println("Email: " + client.getEmail());
            printFile.println("Tipo: PF");
            printFile.println("Nome: " + client.getName());
            printFile.println("CPF: " + this.getCpf());
            printFile.println("RG: " + this.getRg());
            printFile.println("DataNascimento: " + this.getBirthDate());
            printFile.println("Rua: " + address.getStreet());
            printFile.println("Numero: " + address.getNumber());
            printFile.println("CEP: " + address.getZipcode());
            printFile.println("Cidade: " + address.getCity());
            printFile.println("Estado: " + address.getState());
            printFile.println("Acesso: " + client.getAccess());
            printFile.println("Senha: " + client.getPassword());

            printFile.println();

            printFile.close();
            file.close();

            return "Cadastrado com sucesso!";

        } catch (IOException ex) {
            return "Erro ao cadastrar!";
        }
    }

}
