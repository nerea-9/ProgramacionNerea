package Tema6;

public class Animal {

    private String nombre;
    private double peso;
    private String raza;

    public Animal(){
        nombre = "";
        peso = 0;
        raza = "";
    }

    public Animal(String nombre, double peso, String raza){
        this.nombre = nombre;
        this.peso = peso;
        this.raza = raza;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getPeso(){
        return peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }

    public String getRaza(){
        return raza;
    }
    public void setRaza(String raza){
        this.raza= raza;
    }

    public void comer(){
        System.out.println(nombre + " esta comiendo");
    }

    public void dormir(){
        System.out.println(nombre + " esta durmiendo");
    }

    public void hacerRuido(){
        System.out.println(nombre + " esta haciendo ruido");
    }

    public String toString(){
        return "Nombre: " + nombre + ", Peso: " + peso + ", Raza: " + raza;
    }
}
