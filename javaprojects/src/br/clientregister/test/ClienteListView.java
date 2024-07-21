package br.clientregister.test;

import javax.swing.*;

public class ClienteListView extends JFrame {

    public ClienteListView(){
        setTitle("Lista de Clientes");
        setSize(600,400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JTable clienteTable = new JTable();
        JScrollPane scrollPane = new JScrollPane(clienteTable);

    }
}
