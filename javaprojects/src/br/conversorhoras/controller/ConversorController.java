package br.conversorhoras.controller;


import br.conversorhoras.domain.Conversor;

public class ConversorController {

    Conversor conversor;

    public void setConversor(Conversor conversor){
        this.conversor = conversor;
    }

    public Conversor getConversor(){
        return this.conversor;
    }

}
