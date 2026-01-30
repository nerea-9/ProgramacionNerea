package Tema3;

import java.util.Scanner;

public class Ejercicio1 {

    public static int numberSign(int n) {
        if (n > 0){
            return 1;
        } else if (n < 0){
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número:");
        int n = sc.nextInt();

        int sign = numberSign(n);

        if (sign == 1) {
            System.out.println("El número es positivo");
        } else if (sign == -1) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }
        sc.close();
    }
}