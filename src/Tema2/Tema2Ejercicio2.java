package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la base del rectángulo: ");
        int base = scanner.nextInt();

        System.out.print("Introduce la altura del rectángulo: ");
        int altura = scanner.nextInt();

        int superficie = base * altura;
        int perimetro = 2 * (base + altura);

        System.out.println("Superficie: " + superficie);
        System.out.println("Perímetro: " + perimetro);

        scanner.close();
    }
}
