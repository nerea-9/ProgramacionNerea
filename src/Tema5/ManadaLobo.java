package Tema5;

public class ManadaLobo extends Avistamiento {
    private int numLobos;
    private String observaciones;

    public ManadaLobo(){
        numLobos = 0;
        observaciones = "";
    }

    public ManadaLobo(int hora, int numLobos, String observaciones){
        this.hora = hora;
        this.numLobos = numLobos;
        this.observaciones = observaciones;
    }

    public int getNumLobos(){
        return numLobos;
    }
    public void setNumLobos(int numLobos){
        this.numLobos = numLobos;
    }

    public String getObservaciones(){
        return observaciones;
    }
    public void setObservaciones(String observaciones){
        this.observaciones = observaciones;
    }

    public String toString(){
        return "Nº Lobos: " + numLobos + ", Observaciones: " + observaciones;
    }








}
