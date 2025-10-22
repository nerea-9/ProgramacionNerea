package tema2;

import java.util.Scanner;

public class Tema2Ejercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aprobados = 0;
        int suspendidos = 0;

        System.out.println("Introduce las notas de los alumnos (para terminar, introduce -1):");

        while (true) {
            System.out.print("Nota del alumno: ");
            int nota = scanner.nextInt();

            if (nota == -1) {
                break;
            }

            if (nota >= 5) {
                aprobados++;
            } else {
                suspendidos++;
            }
        }

        System.out.println("Número de aprobados: " + aprobados);
        System.out.println("Número de suspendidos: " + suspendidos);
        scanner.close();
    }
}

