package Tema3;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el día (1-31): ");
        int dia = sc.nextInt();

        System.out.print("Introduce el mes (1-12): ");
        int mes = sc.nextInt();

        System.out.print("Introduce el año: ");
        int ano = sc.nextInt();

        boolean fechaCorrecta = true;

        if (mes < 1 || mes > 12) {
            fechaCorrecta = false;
        } else {
            int diasMes;

            switch (mes) {
                case 4: case 6: case 9: case 11:
                    diasMes = 30;
                    break;
                case 2:
                    // Año bisiesto
                    if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                        diasMes = 29;
                    } else {
                        diasMes = 28;
                    }
                    break;
                default:
                    diasMes = 31;
                    break;
            }

            if (dia < 1 || dia > diasMes) {
                fechaCorrecta = false;
            }
        }

        if (fechaCorrecta) {
            System.out.println("La fecha es correcta.");
        } else {
            System.out.println("La fecha NO es correcta.");
        }

        sc.close();
    }
}

