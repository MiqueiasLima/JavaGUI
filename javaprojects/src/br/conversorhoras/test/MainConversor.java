package br.conversorhoras.test;



import br.conversorhoras.controller.ConversorController;
import br.conversorhoras.domain.Conversor;

import javax.swing.*;

public class MainConversor extends JFrame {

    private JLabel tituloLbl;
    private JTextField horasTxt;
    private JButton conversorBtn;
    private JPanel MainPanel;
    private JLabel valorConvertidoLbl;
    private final ConversorController conversorController = new ConversorController();

    public MainConversor() {
        setContentPane(MainPanel);
        setTitle("Conversor de Horas");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);
        setVisible(true);
        valorConvertidoLbl.setVisible(false);
        conversorBtn.addActionListener(e -> {
            conversorController.setConversor(new Conversor());
            conversorController.getConversor().setHoras(Integer.parseInt(horasTxt.getText()));
            conversorController.getConversor().converteHoras();
            String result = conversorController.getConversor().getHorasConvertidas();
            valorConvertidoLbl.setText(result);
            valorConvertidoLbl.setVisible(true);
        });
    }
}
