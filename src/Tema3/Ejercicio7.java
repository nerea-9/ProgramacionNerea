package Tema3;

import java.util.Scanner;

public class Ejercicio7 {

    public static boolean esPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
            return true;
    }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int numero;

            System.out.println("Introduce números enteros positivos (0 para terminar):");

            do {
                numero = sc.nextInt();

                if (numero > 0) {
                    if (esPrimo(numero)) {
                        System.out.println(numero + " es primo.");
                    } else {
                        System.out.println(numero + " no es primo.");
                    }
                } else if (numero < 0) {
                    System.out.println("Por favor, introduce solo números positivos.");
                }

            } while (numero != 0);
            sc.close();
        }
    }

