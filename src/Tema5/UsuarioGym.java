package Tema5;

public class UsuarioGym {
    // Usar constantes cuando un número no cambia y es una regla fija
    // Ejemplos: edad mínima, daño mínimo, curación, límites, etc (sin magic numbers)
    // Atributos
    public String nombre;
    public int edad;

    // Constructor vacío
    public UsuarioGym(){
        nombre = "";
        edad = 0;
    }

    // Constructor con parametros
    public UsuarioGym(String nombre, int edad){
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

    // Devuelve información como texto

     public String toString(){
        return "Nombre: " + nombre + ", Edad: " + edad;
     }
}
