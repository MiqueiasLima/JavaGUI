package br.clientregister.controller;

import br.clientregister.dao.ClienteDAOImpl;
import br.clientregister.domain.client.Cliente;
import br.clientregister.test.ClienteListView;
import br.clientregister.test.MainRegisterView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientRegisterController {

    private MainRegisterView view;
    private ClienteDAOImpl clienteDAOImpl;

    public ClientRegisterController(MainRegisterView view){
        this.view = view;
        this.clienteDAOImpl = new ClienteDAOImpl();
        this.view.getCadastrarButton().addActionListener(new CadastrarListener());
        this.view.getListarButton().addActionListener(new RecuperarListener());
    }

    class CadastrarListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nome = view.getNome();
            String cpf = view.getCpf();
            String email = view.getEmail();

            // Aqui você pode adicionar a lógica para validar os dados e salvar o cliente em um banco de dados ou lista
            Cliente cliente = new Cliente(nome, cpf, email);
            clienteDAOImpl.addCliente(cliente);

            JOptionPane.showMessageDialog(view, "Cliente cadastrado com sucesso!\n" +
                    "Nome: " + cliente.getNome() + "\n" +
                    "CPF: " + cliente.getCpf() + "\n" +
                    "Email: " + cliente.getEmail());
        }
    }

    class RecuperarListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            ClienteListView clienteListView = new ClienteListView();
            clienteListView.setVisible(true);
        }
    }
}
