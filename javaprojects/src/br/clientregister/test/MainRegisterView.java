package br.clientregister.test;

import javax.swing.*;
import java.awt.*;

public class MainRegisterView extends JFrame {

    private JTextField nomeField = new JTextField(20);
    private JTextField cpfField = new JTextField(20);
    private JTextField emailField = new JTextField(20);
    private JButton cadastrarButton = new JButton("Cadastrar");
    private JPanel MainPanel;

    public MainRegisterView(){
        setContentPane(MainPanel);
        setTitle("Client Register");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);
        setVisible(true);

        // Layout da janela
        setLayout(new GridLayout(4, 2));

        // Adiciona os componentes
        add(new JLabel("Nome:"));
        add(nomeField);
        add(new JLabel("CPF:"));
        add(cpfField);
        add(new JLabel("Email:"));
        add(emailField);
        add(new JLabel());
        add(cadastrarButton);
    }

    public String getNome() {
        return nomeField.getText();
    }

    public String getCpf() {
        return cpfField.getText();
    }

    public String getEmail() {
        return emailField.getText();
    }

    public JButton getCadastrarButton() {
        return cadastrarButton;
    }
}
