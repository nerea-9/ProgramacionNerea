package Tema5;

public class Gato {

    private String nombre;
    private int edad;


    public Gato(){
        nombre = "";
        edad = 0;
    }

    public Gato(String nombre, int edad) throws Exception{
//        if (nombre.length() < 3)
//            throw new Exception("Error: El nombre debe tener al menos 3 caracteres");
//        if (edad < 0)
//            throw new Exception("Error: La edad no puede ser negativa");

        this.setNombre(nombre);
        this.setEdad(edad);

        //this.nombre = nombre;
        //this.edad= edad;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre) throws Exception{
        if (nombre.length() < 3)
            throw new Exception("Error: El nombre debe tener al menos 3 caracteres");

        this.nombre = nombre;
    }

    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad) throws Exception{
        if (edad < 0)
                    throw  new Exception("Error: Edad negativa no se puede introducir");
        this.edad = edad;
    }

    public String toString(){
        return "Nombre: " + nombre + ", Edad: " + edad;
    }
}
