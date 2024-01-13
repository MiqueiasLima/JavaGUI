package br.accountbank.dominio;

public class Conta {
    private String cpf;
    private static int identificador;
    private String titular;
    private String agencia;
    private Data dataDeAbertura;
    private int numero;
    private double saldo;
    private static int totalContas;
//    public Cliente titular = new Cliente();

    public Conta() {
        Conta.totalContas = Conta.totalContas + 1;
        int idConta = identificador++;
        System.out.println("Entrou aqui_1");
    }


    public boolean sacar(double quantidade) {
        if (this.saldo < quantidade) {
            return false;
        } else {
            this.saldo = this.saldo - quantidade;
            return true;
        }
    }

    public void depositar(double quantidade) {
        if (quantidade > 0) {
            this.saldo += quantidade;
        } else {
            System.out.println("Saldo Negativo não permitido");
        }
    }

    public boolean transferePara(Conta destino, double quantidade) {
        boolean retirou = this.sacar(quantidade);
        if (retirou) {
            destino.depositar(quantidade);
            return true;
        } else {
            return false;
        }
    }

    public void setCpf(String cpf) {
        boolean isValid = validarCpf(cpf);
        if (isValid) {
            this.cpf = cpf;
        } else {
            System.out.println("Digite um cpf válido");
        }
    }

    public boolean validarCpf(String cpf) {
        return cpf != null;
    }

    public void getRendimento() {
        double rendimento = this.saldo * 0.1;
        this.saldo = this.saldo + rendimento;
    }

    public String recuperaDadosParaImpressao() {
        String dados = "\nId: " + Conta.identificador;
        dados += "\nTitular: " + this.titular;
        dados += "\nCPF: " + this.cpf;
        dados += "\nAgencia: " + this.agencia;
        dados += "\nNúmero: " + this.numero;
        dados += "\nSaldo: " + this.saldo;
        dados += "\nData de Abertura: " + this.dataDeAbertura.formatada();
        return dados;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getTotalContas() {
        return Conta.totalContas;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public Data getDataDeAbertura() {
        return dataDeAbertura;
    }

    public void setDataDeAbertura(Data dataDeAbertura) {
        this.dataDeAbertura = dataDeAbertura;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getIdentificador() {
        return Conta.identificador;
    }

}
