package RehacerTodoPrincipio.Tema1.Ejercicios2;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int n1 = scanner.nextInt();

        System.out.println("Introduce otro numero: ");
        int n2 = scanner.nextInt();

        if (n1 > n2){
            System.out.println("El numero mayor es " + n1);
        } else{
            System.out.println("El numero mayor es " + n2);
        }
    }
}
