package tema2;

import java.util.Scanner;

public class Tema2Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int suma = 0, contador = 0, num;

        System.out.println("Introduce números positivos (negativo para terminar):");
        num = sc.nextInt();

        while (num >= 0) {
            suma += num;
            contador++;
            num = sc.nextInt();
        }

        if (contador > 0) {
            double media = (double) suma / contador;
            System.out.println("La media es: " + media);
        } else {
            System.out.println("No se introdujeron números positivos.");
        }
    }
}

