package tema2;

import java.util.Scanner;

public class Tema2Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce A: ");
        int A = sc.nextInt();
        System.out.print("Introduce B: ");
        int B = sc.nextInt();

        if (B > A) {
            System.out.println("Números impares entre " + A + " y " + B + ":");
            for (int i = A + 1; i < B; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("B debe ser mayor que A.");
        }
    }
}

