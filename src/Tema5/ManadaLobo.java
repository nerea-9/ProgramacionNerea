package Tema5;

public class ManadaLobo {
    private int numLobos;
    private String observaciones;

    public ManadaLobo(){
        numLobos = 0;
        observaciones = "";
    }

    public ManadaLobo(int numLobos, String observaciones){
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
