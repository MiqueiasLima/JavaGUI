package br.clientregister.test;

import javax.swing.*;
import java.awt.*;

public class MainRegisterView extends JFrame {

    private JTextField nomeField = new JTextField(20);
    private JTextField cpfField = new JTextField(20);
    private JTextField emailField = new JTextField(20);
    private JButton cadastrarButton = new JButton("Cadastrar");

    private JButton buttonList = new JButton("Listar Clientes");
    private JPanel mainPanel;

    private JPanel buttonPanel = new JPanel();

    public MainRegisterView(){
        setContentPane(mainPanel);
        setTitle("Client Register");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);
        setVisible(true);

        // Layout da janela

        mainPanel.setLayout(new BorderLayout());
        JPanel inputPanel = new JPanel(new GridLayout(3, 2));
        inputPanel.add(new JLabel("Nome:"));
        inputPanel.add(nomeField);
        inputPanel.add(new JLabel("CPF:"));
        inputPanel.add(cpfField);
        inputPanel.add(new JLabel("Email:"));
        inputPanel.add(emailField);

        mainPanel.add(inputPanel, BorderLayout.CENTER);

        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(buttonList);
        buttonPanel.add(cadastrarButton);

        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

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

    public JButton getListarButton(){
        return buttonList;
    }
}
