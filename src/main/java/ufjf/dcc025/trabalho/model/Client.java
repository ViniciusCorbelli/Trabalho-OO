package ufjf.dcc025.trabalho.model;

import java.util.UUID;

/*
  @autores: Ant�nio Marcos Souza Pereira - 202065245A
            Pedro Barbosa Chaves - 202065236A
            Rafaela Fernandes Horta - 202065182A
            Vin�cius de Oliveira Corbelli - 202065093A
 */
public class Client {

    private static UUID id;
    private static String name;
    private static String email;
    private static accessType access;
    private static String cpf;
    private static String rg;
    private static String birthDate;
    private static Address address;
    private static String password;

    public enum accessType {
        ADMINISTRATOR, EMPLOYEE, USER
    }

    public Client(String name, String email, accessType access, String cpf, String rg, String birthDate, Address address, String password) {
        Client.id = UUID.randomUUID();
        Client.name = name;
        Client.email = email;
        Client.access = access;
        Client.cpf = cpf;
        Client.rg = rg;
        Client.birthDate = birthDate;
        Client.address = address;
        Client.password = password;
    }

    public static UUID getId() {
        return id;
    }

    public static String getName() {
        return name;
    }

    public static String getEmail() {
        return email;
    }

    public static accessType getAccess() {
        return access;
    }

    public static String getCPF() {
        return cpf;
    }

    public static String getRg() {
        return rg;
    }

    public static String getBirthDate() {
        return birthDate;
    }

    public static Address getAddress() {
        return address;
    }

    public static String getPassword() {
        return password;
    }

    public static void setName(String name) {
        Client.name = name;
    }

    public static void setEmail(String email) {
        Client.email = email;
    }

    public static void setAccess(accessType access) {
        Client.access = access;
    }

    public static void setCPF(String cpf) {
        Client.cpf = cpf;
    }

    public static void setRg(String rg) {
        Client.rg = rg;
    }

    public static void setBirthDate(String birthDate) {
        Client.birthDate = birthDate;
    }

    public static void setPassword(String password) {
        Client.password = password;
    }

}
