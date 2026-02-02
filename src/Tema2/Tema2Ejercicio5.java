package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, introduce un número: ");
        int num1 = scanner.nextInt();
        System.out.print("Por favor, introduce un número: ");
        int num2 = scanner.nextInt();
        System.out.print("Por favor, introduce un número: ");
        int num3 = scanner.nextInt();


        double mediaDecimal = (num1 + num2 + num3) / 3.0;

        // Media sin decimales (división entera)
        int mediaEntera = (num1 + num2 + num3) / 3;

        System.out.println("La media con decimales es: " + mediaDecimal);
        System.out.println("La media sin decimales es: " + mediaEntera);


        scanner.close();
    }
}
