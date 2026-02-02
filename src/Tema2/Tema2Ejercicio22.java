package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int num = sc.nextInt();

        int cifras = 0;
        if (num == 0)
            cifras = 1;
        else {
            while (num > 0) {
                num /= 10;
                cifras++;
            }
        }

        System.out.println("El número tiene " + cifras + " cifras.");
    }
}

