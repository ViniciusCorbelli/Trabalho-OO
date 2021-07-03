package ufjf.dcc025.trabalho;

import ufjf.dcc025.trabalho.view.login;

public class App {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }
}
