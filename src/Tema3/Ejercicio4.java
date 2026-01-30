package Tema3;

import java.util.Scanner;

public class Ejercicio4 {

    public static double euro2dollar(double euros) {

        return euros * 1.08;
    }
    public static double dollar2euro(double dollars) {

        return dollars / 1.08;
    }


    public static void showMenu() {
        System.out.println("Conversor de Moneda");
        System.out.println("1. Euros a Dólares");
        System.out.println("2. Dólares a Euros");
        System.out.println("3. Salir");
        System.out.print("Elige una opción: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            showMenu();
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.print("Introduce cantidad en euros: ");
                double euros = sc.nextDouble();
                System.out.println("Resultado: " + euro2dollar(euros) + " $");
            } else if (opcion == 2) {
                System.out.print("Introduce cantidad en dólares: ");
                double dollars = sc.nextDouble();
                System.out.println("Resultado: " + dollar2euro(dollars) + " €");
            } else if (opcion == 3) {
                System.out.println("Fin del programa.");
            } else {
                System.out.println("Opción no válida.");
            }
        } while (opcion != 3);

        sc.close();
    }
}
