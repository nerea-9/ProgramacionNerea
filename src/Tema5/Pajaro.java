package Tema5;

public class Pajaro extends Avistamiento{
    private double peso;
    private String especie;

    public Pajaro(){
        peso = 0;
        especie = "";
    }

    public Pajaro(double peso, String especie){
        this.peso = peso;
        this.especie = especie;
    }

    public double getPeso(){
        return peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }

    public String getEspecie(){
        return especie;
    }
    public void setEspecie(String especie){
        this.especie = especie;
    }

    public String toString(){
        return "Peso: " + peso + ", ESpecie: " + especie;
    }
}
