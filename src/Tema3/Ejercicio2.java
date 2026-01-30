package Tema3;
import java.util.Scanner;

import static Tema3.Ejercicio1.numberSign;

public class Ejercicio2 {



    public static boolean isAdult(int age) {
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int n = scanner.nextInt();
        int sign = numberSign(n);

        if (sign == 1) {
            System.out.println("El número es positivo.");
        } else if (sign == -1) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();
        boolean adulto = isAdult(edad);

        if (adulto) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }

        scanner.close();
    }

}
