package Tema2;

import java.util.Scanner;
public class Tema2Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double tipoCambio = 1.06;

        System.out.print("Introduce la cantidad en euros: ");
        double euros = scanner.nextDouble();

        double dolares = euros * tipoCambio;

        System.out.println(euros + " euros equivalen a " + dolares + " dólares.");

        scanner.close();
    }
}
