/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.model;

public class Payment extends Movement {

    private static String barcode;

    public static String getBarcode() {
        return barcode;
    }

    public static void setBarcode(String barcode) {
        Payment.barcode = barcode;
    }
}
