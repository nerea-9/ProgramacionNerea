package Tema2;

import java.util.Scanner;
public class Tema2Ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        double num = scanner.nextDouble();

        if (num < 0) {
            System.out.println("Error: no se puede calcular la raíz cuadrada de un número negativo.");
        } else {
            double raiz = Math.sqrt(num);
            System.out.println("La raíz cuadrada de " + num + " es " + raiz);
        }

        scanner.close();
    }
}
