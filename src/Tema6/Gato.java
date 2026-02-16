package Tema6;

public class Gato extends Animal{

    public Gato(String nombre, double peso, String raza){
        super(nombre, peso, raza);
    }

    public void maullar(){
        System.out.println(getNombre() + " esta maullando");
    }

}
