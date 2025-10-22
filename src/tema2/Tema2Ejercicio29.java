package tema2;

import java.util.Random;
import java.util.Scanner;

public class Tema2Ejercicio29 {
    public static void main(String[] args) {
        Random random = new Random();
        int secreto = random.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);

        int intento;
        System.out.println("Adivina el número (entre 1 y 100):");

        do {
            System.out.print("Tu intento: ");
            intento = sc.nextInt();

            if (intento < secreto) {
                System.out.println("El número secreto es mayor.");
            } else if (intento > secreto) {
                System.out.println("El número secreto es menor.");
            } else {
                System.out.println("¡Has acertado!");
            }
        } while (intento != secreto);
    }
}

