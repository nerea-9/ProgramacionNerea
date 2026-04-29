package RehacerTodoPrincipio.Tema1.Ejercicios2;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int n1 = scanner.nextInt();

        if (n1 >= 0){
            System.out.println("El numero es positvo");
        }  else {
            System.out.println("El numero es negativo");
        }
    }
}
