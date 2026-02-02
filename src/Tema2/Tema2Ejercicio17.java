package Tema2;

import java.util.Scanner;
public class Tema2Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce 0 para cuadrado, 1 para rectángulo, 2 para triángulo: ");
        int opcion = scanner.nextInt();

        if (opcion == 0) {
            System.out.print("Introduce el lado del cuadrado: ");
            double lado = scanner.nextDouble();

            double superficie = lado * lado;
            double perimetro = 4 * lado;

            System.out.println("Superficie del cuadrado: " + superficie);
            System.out.println("Perímetro del cuadrado: " + perimetro);

        } else if (opcion == 1) {
            System.out.print("Introduce la base del rectángulo: ");
            double base = scanner.nextDouble();

            System.out.print("Introduce la altura del rectángulo: ");
            double altura = scanner.nextDouble();

            double superficie = base * altura;
            double perimetro = 2 * (base + altura);

            System.out.println("Superficie del rectángulo: " + superficie);
            System.out.println("Perímetro del rectángulo: " + perimetro);

        } else if (opcion == 2) {
            System.out.print("Introduce la base del triángulo: ");
            double base = scanner.nextDouble();

            System.out.print("Introduce la altura del triángulo: ");
            double altura = scanner.nextDouble();

            double superficie = (base * altura) / 2;

            System.out.println("Superficie del triángulo: " + superficie);

        } else {
            System.out.println("Error: opción inválida.");
        }

        scanner.close();
    }
}
