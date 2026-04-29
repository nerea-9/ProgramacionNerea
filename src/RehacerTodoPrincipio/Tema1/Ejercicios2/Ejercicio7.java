package RehacerTodoPrincipio.Tema1.Ejercicios2;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un valor correspondiente a una distancia en millas marinas: ");
        double millas = sc.nextDouble();

        double metrosPorMilla = 1852;

        double conversion = millas * metrosPorMilla;

        System.out.println("La distancia en metros es: " + conversion);

    }
}
