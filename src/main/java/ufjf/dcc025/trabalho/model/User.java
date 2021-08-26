/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.model;

/**
 *
 * @author Vinícius
 */
public class User {

    private String name;
    private String email;
    private accessType access;
    private String password;
    public accessType accessTypeEnum;

    public enum accessType {
        ADMINISTRATOR, EMPLOYEE, USER
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public accessType getAccess() {
        return access;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
    	this.email = email;
    }

    public void setAccess(accessType access) {
    	this.access = access;
    }

    public void setPassword(String password) {
    	this.password = password;
    }
}
