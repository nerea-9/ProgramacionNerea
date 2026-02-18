package Tema6;

public class Rectangulo extends Figura2D{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double area(){
        return base * altura;
    }

    public double perimetro(){
        return 2 * (base + altura);
    }

    public String toString(){
        return "Base del rectangulo: " + base + ", Altura del rectangulo: " + altura;
    }
}
