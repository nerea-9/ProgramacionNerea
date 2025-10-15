package tema2;

import java.util.Scanner;

public class Tema2Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número del mes (1-12): ");
        int mes = scanner.nextInt();


        if (mes < 1 || mes > 12) {
            System.out.println("Mes inválido");
            scanner.close();
            return;
        }

        System.out.print("Introduce el año: ");
        int anyo = scanner.nextInt();


        if (anyo <= 0) {
            System.out.println("Año inválido");
            scanner.close();
            return;
        }

        int dias;

        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dias = 31;
                break;
            case 4: case 6: case 9: case 11:
                dias = 30;
                break;
            case 2:
                if ((anyo % 4 == 0) && ((anyo % 100 != 0) || (anyo % 400 == 0))) {
                    dias = 29;
                } else {
                    dias = 28;
                }
                break;
            default:
                System.out.println("Mes inválido");
                scanner.close();
                return;
        }

        System.out.println("El mes " + mes + " del año " + anyo + " tiene " + dias + " días.");

        scanner.close();
    }
}

