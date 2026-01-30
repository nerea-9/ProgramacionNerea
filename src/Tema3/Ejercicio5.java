package Tema3;
import java.util.Scanner;

public class Ejercicio5 {

    public static void tablaMultiplicar (int numero){
        if (numero >= 1 && numero <= 10) {
            System.out.println("Tabla de multiplicar del " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        } else {
            System.out.println("Número fuera de rango. Debe estar entre 1 y 10.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero del 1 al 10: ");
        int numero = sc.nextInt();

        sc.close();
    }
}

