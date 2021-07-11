package ufjf.dcc025.trabalho.model;

import java.util.UUID;

/*
  @autores: Antônio Marcos Souza Pereira - 202065245A
            Pedro Barbosa Chaves - 202065236A
            Rafaela Fernandes Horta - 202065182A
            Vinícius de Oliveira Corbelli - 202065093A
 */
public class client {

    private static UUID id;
    private static String name;
    private static String email;
    private static accessType access;
    private static String cpf;
    private static String rg;
    private static String birthDate;
    private static address address;
    private static String password;

    public enum accessType {
        ADMINISTRATOR, EMPLOYEE, USER
    }

    public client(String name, String email, accessType access, String cpf, String rg, String birthDate, address address, String password) {
        client.id = UUID.randomUUID();
        client.name = name;
        client.email = email;
        client.access = access;
        client.cpf = cpf;
        client.rg = rg;
        client.birthDate = birthDate;
        client.address = address;
        client.password = password;
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

    public static address getAddress() {
        return address;
    }

    public static String getPassword() {
        return password;
    }

    public static void setName(String name) {
        client.name = name;
    }

    public static void setEmail(String email) {
        client.email = email;
    }

    public static void setAccess(accessType access) {
        client.access = access;
    }

    public static void setCPF(String cpf) {
        client.cpf = cpf;
    }

    public static void setRg(String rg) {
        client.rg = rg;
    }

    public static void setBirthDate(String birthDate) {
        client.birthDate = birthDate;
    }

    public static void setPassword(String password) {
        client.password = password;
    }

}
