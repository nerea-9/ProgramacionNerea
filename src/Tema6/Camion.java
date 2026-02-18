package Tema6;

public class Camion extends Vehiculo {

    private int pesoMaxAutorizado;
    private boolean mercanciaPeligrosa;

    public Camion(){
        pesoMaxAutorizado = 0;
        mercanciaPeligrosa = false;
    }

    public Camion(String matricula, String marca, String modelo, int pesoMaxAutorizado, boolean mercanciaPeligrosa){
        super(matricula, marca, modelo);
        this.pesoMaxAutorizado = pesoMaxAutorizado;
        this.mercanciaPeligrosa = mercanciaPeligrosa;
    }

    public int getPesoMaxAutorizado(){
        return pesoMaxAutorizado;
    }
    public void setPesoMaxAutorizado(int pesoMaxAutorizado){
        this.pesoMaxAutorizado = pesoMaxAutorizado;
    }

    public boolean getMercanciaPeligrosa(){
        return mercanciaPeligrosa;
    }
    public void setMercanciaPeligrosa(boolean mercanciaPeligrosa){
        this.mercanciaPeligrosa = mercanciaPeligrosa;
    }


    public String toString(){
        return super.toString() + ", PesoMaxAutorizado: " + pesoMaxAutorizado + ", MercanciaPeligrosa: " + mercanciaPeligrosa;
    }
}
