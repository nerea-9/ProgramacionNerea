package Tema6;

public class Pajaro extends Animal{

    public Pajaro(String nombre, double peso, String raza){
        super(nombre, peso, raza);
    }

    public void volar(){
        System.out.println(getNombre() + " esta volando");
    }
}
