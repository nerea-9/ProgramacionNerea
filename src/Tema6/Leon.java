package Tema6;

public class Leon extends Animal{

    public Leon(String nombre, double peso, String raza){
        super(nombre, peso, raza);
    }

    public void rugir(){
        System.out.println(getNombre() + " esta rugiendo");
    }
}
