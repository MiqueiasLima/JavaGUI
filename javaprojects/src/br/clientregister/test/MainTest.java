package br.clientregister.test;

import br.clientregister.controller.ClientController;

public class MainTest {
    public static void main(String[] args) {
        MainRegisterView view = new MainRegisterView();
        ClientController controller = new ClientController(view);
        view.setVisible(true);
    }
}
