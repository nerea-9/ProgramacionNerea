package Tema5;

public class Serpiente {

    private int longitud;
    private String especie;

    public Serpiente(){
        longitud = 0;
        especie = "";
    }

    public Serpiente(int longitud, String especie){
        this.longitud = longitud;
        this.especie = especie;
    }

    public int getLongitud(){
        return longitud;
    }
    public void setLongitud(int longitud){
        this.longitud = longitud;
    }

    public String getEspecie(){
        return especie;
    }
    public void setEspecie(String especie){
        this.especie = especie;
    }

    public String toString(){
        return "Longitud: " + longitud + ", Especie: " + especie;
    }
}
