package br.accountbank.dominio;

public class Cliente {

    private String nome;
    private String endereco;
    private String cpf;
    private int idade;

    public void mudarCpf(String cpf){
        if(this.idade <= 60){
            validaCpf(cpf);
        }
        this.cpf = cpf;
    }

    public void validaCpf(String cpf){
        /**
         * Código de validação aqui
         */
    }



}
