package tema2;

import java.util.Scanner;
public class Tema2Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, introduce un número: ");
        int num1 = scanner.nextInt();
        System.out.print("Por favor, introduce un número: ");
        int num2 = scanner.nextInt();

        int mayor, menor;

        if (num1 > num2) {
            mayor = num1;
            menor = num2;
        } else {
            mayor = num2;
            menor = num1;
        }

        int resultado = mayor - menor;

        System.out.println("Resultado de restar el mayor al menor: " + resultado);

        scanner.close();

    }

}
