package ufjf.dcc025.trabalho.model;

/*
  @autores: Antônio Marcos Souza Pereira - 202065245A
            Pedro Barbosa Chaves - 202065236A
            Rafaela Fernandes Horta - 202065182A
            Vinícius de Oliveira Corbelli - 202065093A
 */

public class address {

    private static String street;
    private static String number;
    private static String zipcode;
    private static String city;
    private static String state;

    public address(String street, String number, String zipcode, String city, String state) {
        address.street = street;
        address.number = number;
        address.zipcode = zipcode;
        address.city = city;
        address.state = state;;
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
        address.street = street;
    }

    public static void setNumber(String number) {
        address.number = number;
    }

    public static void setZipcode(String zipcode) {
        address.zipcode = zipcode;
    }

    public static void setCity(String city) {
        address.city = city;
    }

    public static void setState(String state) {
        address.state = state;
    }

}
