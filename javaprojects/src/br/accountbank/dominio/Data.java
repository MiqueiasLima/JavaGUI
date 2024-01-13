package br.accountbank.dominio;

public class Data {

    public int dia;
    public int mes;
    public int ano;

    public Data(int dia, int mes, int ano) {
        this.preencheData(dia, mes, ano);
    }

    private boolean isDataViavel(int dia, int mes, int ano) {
        if (dia <= 0 || mes <= 0) {
            return false;
        }
        int ultimoDiaDoMes = 31;    //	por	padrao	são	31	dias
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            ultimoDiaDoMes = 30;
        } else if (mes == 2) {
            if (ano % 4 == 0) {
                ultimoDiaDoMes = 29;
            } else {
                ultimoDiaDoMes = 28;
            }
        }
        return dia <= ultimoDiaDoMes;
    }

    void preencheData(int dia, int mes, int ano) {
        if (!isDataViavel(dia, mes, ano)) {
            System.out.println("A	data	" + dia + "/" + mes + "/" + ano + "	não	existe!");
        } else {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }


    public String formatada() {
        return "" + dia + "/" + mes + "/" + ano;
    }
}
