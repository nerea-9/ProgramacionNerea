package RehacerTodoPrincipio.Tema1.Ejercicios2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Introduce un numero: ");
        double n1 = sc.nextInt();

        System.out.println("Introduce otro numero: ");
        double n2 = sc.nextInt();

        double suma = n1 + n2;
        double resta = n1 - n2;
        double producto = n1 * n2;
        double division = n1 / n2;

        System.out.println("La suma de los dos numeros es: " + suma);
        System.out.println("La resta de los dos numeros es: " + resta);
        System.out.println("El producto de los dos numeros es: " + producto);
        System.out.println("La division de los dos numeros es: " + division);
    }
}
