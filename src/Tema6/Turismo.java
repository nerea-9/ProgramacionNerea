package Tema6;

public class Turismo extends Vehículo {

    private int numPlazas;
    private boolean tipoUso;

    public Turismo(){
        numPlazas = 0;
        tipoUso = false;
    }

    public Turismo(String matricula, String marca, String modelo, int numPlazas, boolean tipoUso){
        super(matricula, marca, modelo);
        this.numPlazas = numPlazas;
        this.tipoUso = tipoUso;
    }

    public int getNumPlazas(){
        return numPlazas;
    }
    public void setNumPlazas(int numPlazas){
        this.numPlazas = numPlazas;
    }

    public boolean getTipoUso(){
        return tipoUso;
    }
    public void setTipoUso(boolean tipoUso){
        this.tipoUso = tipoUso;
    }

    public String toString(){
        return super.toString() + ", NumeroPlazas: " + numPlazas + ", TipoUso: " + tipoUso;
    }
}
