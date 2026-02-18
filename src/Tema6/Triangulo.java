package Tema6;

public class Triangulo extends Figura2D{
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double base, double altura, double lado1, double lado2, double lado3){
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double area(){
        return (base * altura) / 2;
    }

    public double perimetro(){
        return lado1 + lado2 + lado3;
    }

    public String toString(){
        return "Base del triangulo: " + base + ", Altura del triangulo: " + altura + ", Lado 1 del triangulo: " + lado1 +  ", Lado 2 del triangulo: " + lado2 + ", Lado 3 del triangulo: " + lado3;
    }
}
