package Tema5;

import java.util.HashMap;
import java.util.Map;

public class Usuario {
    // Usar constantes cuando un número no cambia y es una regla fija
    // Ejemplos: edad mínima, daño mínimo, curación, límites, etc (sin magic numbers)
    // Atributos
    public String nombre;
    public int edad;

    // Constructor vacío
    public Usuario(){
        nombre = "";
        edad = 0;
    }

    // Constructor con parametros
    public Usuario(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters y setters
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
          this.nombre = nombre;
    }

    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }

    // Metodos


    public static void main(String[] args){
        Map<String, Integer> usuarios = new HashMap<>();
        usuarios.put("Juan", 40);
        usuarios.put("Maria", 20);
        usuarios.put("Paco", 33);
        usuarios.put("Carmen", 55);

        String dni = "DNI";

        if(usuarios.containsKey(dni)){
            System.out.println("DNI de " + dni + "es: "+ usuarios.get(dni));
        }

        for (Map.Entry<String, Integer> entrada : usuarios.entrySet()){
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }

    }




    // Imprime la información
    // public void () {System.out.println(this.toString());}

    // Devuelve información como texto

    // public String toString(){}
}
