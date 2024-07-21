package br.clientregister.test;

import br.clientregister.controller.ClientRegisterController;

public class MainTest {
    public static void main(String[] args) {
        MainRegisterView view = new MainRegisterView();
        ClientRegisterController controller = new ClientRegisterController(view);
        view.setVisible(true);
    }
}
