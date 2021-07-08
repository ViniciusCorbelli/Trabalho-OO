package ufjf.dcc025.trabalho.controller;

import java.util.UUID;

public class Client {
    UUID id;
    String name;
    String email;
    String cpf;
    String rg;
    Address address;
    String birthDate;
    String password;

    public Client(String name, String email, String cpf, String rg, Address address, String birthDate, String password){
        this.id = UUID.randomUUID();
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.rg = rg;
        this.address = address;
        this.birthDate = birthDate;
        this.password = password;
    }
}
