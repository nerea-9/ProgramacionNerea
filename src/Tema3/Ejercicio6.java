package Tema3;

public class Ejercicio6 {


    public static void Multiplicar(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public static void main(String[] args) {

        for (int numero = 1; numero <= 10; numero++) {
            System.out.println("Tabla de multiplicar del " + numero + ":");
            Multiplicar(numero);

        }
    }
}












