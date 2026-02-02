package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, introduce un número: ");
        int num1 = scanner.nextInt();
        System.out.print("Por favor, introduce un número: ");
        int num2 = scanner.nextInt();
        System.out.print("Por favor, introduce un número: ");
        int num3 = scanner.nextInt();

        if ((num2 == num1 + 1 && num3 == num2 + 1) || (num2 == num1 - 1 && num3 == num2 - 1)) {
            System.out.println("Los números son consecutivos.");
        } else {
            System.out.println("Los números NO son consecutivos.");
        }

        scanner.close();
    }
}
