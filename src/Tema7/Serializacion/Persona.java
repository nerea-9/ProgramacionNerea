package Tema7.Serializacion;

import java.io.Serializable;

public class Persona implements Serializable {
    // Atributos
    String nombre;
    int edad;

    // Constructor vacío
    public Persona(){
        nombre = "";
        edad = 0;
    }

    // Constructor con parametros
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters y setters
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }

    // Devuelve información como texto
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }
}

