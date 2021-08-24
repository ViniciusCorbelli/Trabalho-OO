/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.model;

public class Deposit extends Movement {
    
    private static String accountNumber;
    private static String branchNumber;

    public static String getAccountNumber() {
        return accountNumber;
    }

    public static void setAccountNumber(String accountNumber) {
        Deposit.accountNumber = accountNumber;
    }

    public static String getBranchNumber() {
        return branchNumber;
    }

    public static void setBranchNumber(String branchNumber) {
        Deposit.branchNumber = branchNumber;
    }
}
