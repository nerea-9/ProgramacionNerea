package Tema6;

public class Vaca extends Animal {

    public Vaca(String nombre, double peso, String raza){
        super(nombre, peso, raza);
    }

    public void mugir(){
        System.out.println(getNombre() + " esta mugiendo");
    }
}
