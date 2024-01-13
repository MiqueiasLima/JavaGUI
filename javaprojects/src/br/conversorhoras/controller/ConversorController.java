package br.conversorhoras.controller;


import br.conversorhoras.domain.Conversor;
import br.conversorhoras.test.MainConversorView;
import com.sun.tools.javac.Main;

public class ConversorController {

    Conversor conversor;
    MainConversorView mainConversorView;

    public ConversorController(Conversor conversor, MainConversorView mainConversorView){
        this.conversor = conversor;
        this.mainConversorView = mainConversorView;

    }

    public void setConversor(Conversor conversor){
        this.conversor = conversor;
    }

    public Conversor getConversor(){
        return this.conversor;
    }

}
