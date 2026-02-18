package Tema6;

public class Ciclomotor extends Vehiculo {

    private int cilindrada;

    public Ciclomotor(){
        cilindrada = 0;
    }

    public Ciclomotor(String matricula, String marca, String modelo, int cilindrada){
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada(){
        return cilindrada;
    }
    public void setCilindrada(int cilindrada){
        this.cilindrada = cilindrada;
    }

    public boolean necesitaCarnet(){
            return cilindrada >= 125;
    }

    public String toString(){
        return super.toString() + ", Cilindrada: " + cilindrada + ", NecesitaCarnet: " + necesitaCarnet();
    }
}
