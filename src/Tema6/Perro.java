package Tema6;

public class Perro extends Animal{

    public Perro(String nombre, double peso, String raza){
        super(nombre, peso, raza);
    }

    public void ladrar(){
        System.out.println(getNombre() + " esta ladrando");
    }
}
