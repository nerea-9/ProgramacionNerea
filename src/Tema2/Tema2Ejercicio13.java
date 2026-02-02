package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce las horas (0-23): ");
        int horas = scanner.nextInt();

        System.out.print("Introduce los minutos (0-59): ");
        int minutos = scanner.nextInt();

        System.out.print("Introduce los segundos (0-59): ");
        int segundos = scanner.nextInt();


        if (horas < 0 || horas > 23 || minutos < 0 || minutos > 59 || segundos < 0 || segundos > 59) {
            System.out.println("Hora incorrecta");
            scanner.close();
            return;
        }


        segundos += 1;

        if (segundos == 60) {
            segundos = 0;
            minutos += 1;
        }

        if (minutos == 60) {
            minutos = 0;
            horas += 1;
        }

        if (horas == 24) {
            horas = 0;
        }

        System.out.printf("La hora con un segundo más es: %02d:%02d:%02d", horas, minutos, segundos);

        scanner.close();
    }
}

