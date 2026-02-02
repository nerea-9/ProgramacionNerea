package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, introduce un número: ");
        int num1 = scanner.nextInt();
        System.out.print("Por favor, introduce un número: ");
        int num2 = scanner.nextInt();
        System.out.print("Por favor, introduce un número: ");
        int num3 = scanner.nextInt();

        int mayor = num1;

        if (num2 > mayor) {
            mayor = num2;
        }

        if (num3 > mayor) {
            mayor = num3;
        }

        System.out.println("El número que has introducido es: " + mayor);

        scanner.close();
    }
}
