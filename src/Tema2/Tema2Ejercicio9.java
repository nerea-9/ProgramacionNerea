package Tema2;

import java.util.Scanner;
public class Tema2Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tipoCambio = 0.94;

        System.out.print("Introduce la cantidad en dólares: ");
        double dolares = scanner.nextDouble();

        double euros = dolares * tipoCambio;

        System.out.println(dolares + " dólares equivalen a " + euros + " euros.");

        scanner.close();
    }
}
