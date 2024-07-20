package br.clientregister.controller;

import br.clientregister.dao.ClienteDAOImpl;
import br.clientregister.domain.client.Cliente;
import br.clientregister.test.MainRegisterView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientController {

    private MainRegisterView view;
    private ClienteDAOImpl clienteDAOImpl;

    public ClientController(MainRegisterView view){
        this.view = view;
        this.clienteDAOImpl = new ClienteDAOImpl();
        this.view.getCadastrarButton().addActionListener(new CadastrarListener());
    }

    class CadastrarListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nome = view.getNome();
            String cpf = view.getCpf();
            String email = view.getEmail();

            // Aqui você pode adicionar a lógica para validar os dados e salvar o cliente em um banco de dados ou lista
            Cliente cliente = new Cliente(nome, cpf, email);
            clienteDAOImpl.addUser(cliente);

            JOptionPane.showMessageDialog(view, "Cliente cadastrado com sucesso!\n" +
                    "Nome: " + cliente.getNome() + "\n" +
                    "CPF: " + cliente.getCpf() + "\n" +
                    "Email: " + cliente.getEmail());
        }
    }
}
