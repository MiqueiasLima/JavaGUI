package br.conversorhoras.domain;

public class Conversor {

    private int horas;
    private String horasConvertidas;

    public void converteHoras(){
        int horas = this.horas / 3600;
        int segundos = this.horas % 3600;
        int minutos = segundos / 60;
        segundos = segundos % 60;
        String result = horas+" Horas " + minutos+ " minutos " + segundos + " segundos";
        setHorasConvertidas(result);
    }

    private void setHorasConvertidas(String horasConvertidas){
        this.horasConvertidas = horasConvertidas;
    }

    public String getHorasConvertidas(){
        return this.horasConvertidas;
    }

    public void setHoras(int horas){
        this.horas = horas;
    }

}
