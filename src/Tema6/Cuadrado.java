package Tema6;

public class Cuadrado extends Figura2D {
    private double lado;

    public Cuadrado(double lado){
        this.lado = lado;
    }

    public double area(){
        return lado * lado;
    }

    public double perimetro(){
        return 4 * lado;
    }

    public String toString(){
        return "Lado del cuadrado: " + lado;
    }
}
