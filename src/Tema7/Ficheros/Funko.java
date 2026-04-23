package Tema7.Ficheros;

public class Funko {
    // Atributos
    int codigo;
    String nombre;
    String modelo;
    double precio;
    int fecha;

    // Constructor vacío
    public Funko (){
       int codigo = 0;
       String nombre = "";
       String modelo = "";
       double precio = 0;
       int fecha = 0;
    }

    // Constructor con parametros
    public Funko (int codigo, String nombre, String modelo, double precio,int fecha){
        this.codigo = codigo;
        this.nombre = nombre;
        this.modelo = modelo;
        this.precio = precio;
        this.fecha = fecha;
    }

    // Getters y setters
    public int getCodigo() {return codigo;}
    public void setCodigo(int codigo) {this.codigo = codigo;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getModelo() {return modelo;}
    public void setModelo(String modelo) {this.modelo = modelo;}

    public double getPrecio() {return precio;}
    public void setPrecio(double precio) {this.precio = precio;}

    public int getFecha() {return fecha;}
    public void setFecha(int fecha) {this.fecha = fecha;}

    // Devuelve información como texto
    public String toString() {
        return "Codigo: " + codigo + ", Nombre: " + nombre + ", Modelo: " + modelo + ", Precio: " + precio + ", Fecha: " + fecha;
    }
}
