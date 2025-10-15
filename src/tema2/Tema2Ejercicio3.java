package tema2;

import java.util.Scanner;

public class Tema2Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la base del triángulo: ");
        double base = scanner.nextDouble();

        System.out.print("Introduce la altura del triángulo: ");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("La superficie del triángulo es: " + area);

        scanner.close();
    }
}
