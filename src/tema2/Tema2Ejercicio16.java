package tema2;

import java.util.Scanner;
public class Tema2Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce 'D' para convertir euros a dólares o 'E' para dólares a euros: ");
        char opcion = scanner.next().toUpperCase().charAt(0);

        System.out.print("Introduce la cantidad: ");
        double cantidad = scanner.nextDouble();

        double tipoCambioEurosADolares = 1.06;
        double tipoCambioDolaresAEuros = 0.94;

        if (opcion == 'D') {
            double dolares = cantidad * tipoCambioEurosADolares;
            System.out.printf("%.2f euros son %.2f dólares.\n", cantidad, dolares);
        } else if (opcion == 'E') {
            double euros = cantidad * tipoCambioDolaresAEuros;
            System.out.printf("%.2f dólares son %.2f euros.\n", cantidad, euros);
        } else {
            System.out.println("Opción inválida.");
        }

        scanner.close();
    }
}
