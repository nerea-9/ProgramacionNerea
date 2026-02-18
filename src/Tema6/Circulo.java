package Tema6;

public class Circulo extends Figura2D{
    public double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double area() {
        return Math.PI * radio * radio;
    }

    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    public String toString() {
        return "El radio del circulo es:  " + radio;
    }
}
