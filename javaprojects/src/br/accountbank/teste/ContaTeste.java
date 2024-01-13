package br.accountbank.teste;


import br.accountbank.dominio.Conta;
import br.accountbank.dominio.Data;

import javax.swing.*;

public class ContaTeste extends JFrame {

    public static strictfp void main(String... args){
        new BankTest();
        br.accountbank.dominio.Banco banco = new br.accountbank.dominio.Banco();
        Conta c1 = new Conta();
        banco.nome = "Caixa Econômica Federal";
        c1.setTitular("Miquéias de Sousa Lima");
        c1.setAgencia("12-x");
        c1.setNumero(557890);
        c1.setCpf("123.456.789-10");
        c1.depositar(50);
        c1.depositar(100);
        //	Adicionando	a	data	como	tipo
        c1.setDataDeAbertura(new Data(21,	2,	2021));	//	Teste	também	com	datas	válidas
        System.out.println(c1.recuperaDadosParaImpressao());
        System.out.println(banco.nome);
    }
}
