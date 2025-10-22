package tema2;

import java.util.Random;
import java.util.Scanner;

public class Tema2Ejercicio28 {
    public static void main(String[] args) {
        Random random = new Random();
        int ganador = random.nextInt(100000);
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce hasta 5 números (de 0 a 99999):");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Número " + i + ": ");
            int num = sc.nextInt();

            if (num == ganador) {
                System.out.println("¡Has ganado la lotería!");
            } else {
                System.out.println("No has ganado.");
            }
        }

        System.out.println("El número ganador era: " + ganador);
    }
}
