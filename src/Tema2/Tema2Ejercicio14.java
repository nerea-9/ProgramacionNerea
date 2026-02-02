package Tema2;

import java.util.Scanner;
public class Tema2Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número de personas: ");
        int personas = scanner.nextInt();

        System.out.print("Número de días: ");
        int dias = scanner.nextInt();

        double tarifaPorNoche = 15.0;
        double precioTotal = personas * dias * tarifaPorNoche;


        if (personas > 5 && dias >= 7) {
            precioTotal *= 0.75;
        }

        System.out.printf("El precio total de la estancia es: %.2f €\n", precioTotal);

        scanner.close();
    }
}
