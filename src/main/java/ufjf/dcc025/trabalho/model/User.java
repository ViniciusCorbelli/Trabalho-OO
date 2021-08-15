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

    private static String name;
    private static String email;
    private static accessType access;
    private static String password;

    public enum accessType {
        ADMINISTRATOR, EMPLOYEE, USER
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

    public static String getPassword() {
        return password;
    }

    public static void setName(String name) {
        User.name = name;
    }

    public static void setEmail(String email) {
        User.email = email;
    }

    public static void setAccess(accessType access) {
        User.access = access;
    }

    public static void setPassword(String password) {
        User.password = password;
    }
}
