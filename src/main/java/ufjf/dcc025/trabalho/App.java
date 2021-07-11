package ufjf.dcc025.trabalho;

import ufjf.dcc025.trabalho.view.login;

/*
  @autores: Antônio Marcos Souza Pereira - 202065245A
            Pedro Barbosa Chaves - 202065236A
            Rafaela Fernandes Horta - 202065182A
            Vinícius de Oliveira Corbelli - 202065093A
 */

public class App {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }
}
