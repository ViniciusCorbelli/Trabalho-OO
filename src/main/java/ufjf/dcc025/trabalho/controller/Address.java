package ufjf.dcc025.trabalho.controller;

public class Address {

    private static String street;
    private static String number;
    private static String zipcode;
    private static String city;
    private static String state;

    public Address(String street, String number, String zipcode, String city, String state) {
        Address.street = street;
        Address.number = number;
        Address.zipcode = zipcode;
        Address.city = city;
        Address.state = state;;
    }

    public static String getStreet() {
        return street;
    }

    public static String getNumber() {
        return number;
    }

    public static String getZipcode() {
        return zipcode;
    }

    public static String getCity() {
        return city;
    }

    public static String getState() {
        return state;
    }

    public static void setStreet(String street) {
        Address.street = street;
    }

    public static void setNumber(String number) {
        Address.number = number;
    }

    public static void setZipcode(String zipcode) {
        Address.zipcode = zipcode;
    }

    public static void setCity(String city) {
        Address.city = city;
    }

    public static void setState(String state) {
        Address.state = state;
    }

}
